package com.bank.acc;

import java.util.Scanner;

import com.bank.common.DAO;

public class AccManage extends DAO {
	Scanner scn = new Scanner(System.in);
	private static AccManage am = new AccManage();

	private AccManage() {
	}

	public static AccManage getInstance() {
		return am;
	}

	// 계좌개설
	public int insertAcc(AccDTO acc) {
		int result = 0;

		try {
			conn();
			String sql = "insert into account (acc_id,member_id) values (?,?);";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, acc.getAccId());
			pstmt.setString(2, acc.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 입출금 cmd 입출금 구분 좌
	public int updateMoney(AccDTO acc, int cmd) {
		int result = 0;

		try {
			// 잔고계산
			conn();

			// 잔고 가져옴
			String sql2 = "select balance from account here acc_id=? ";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(2, acc.getAccId());
			rs = pstmt.executeQuery();
			int balance = 0;
			if (rs.next()) {
				balance = rs.getInt("balance");
			}

			// 입금
			if (cmd == 1) {
				// balance 잔고
				// acc.getbal = 입금하고자하는금액
				acc.setBalance(balance + acc.getBalance());

				String sql = "update account set balance  =? where acc_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, acc.getBalance());
				pstmt.setString(2, acc.getAccId());

				result = pstmt.executeUpdate();

				// 출금
			} else if (cmd == 2) {
				if ((balance - acc.getBalance()) > 0) {
					acc.setBalance(balance - acc.getBalance());

					String sql = "update account set balance  =? where acc_id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, acc.getBalance());
					pstmt.setString(2, acc.getAccId());

					result = pstmt.executeUpdate();

				} else if ((balance - acc.getBalance()) <= 0) {
					System.out.println("잔액이 부족합니다.");
				}
			}

//			 String sql = "update account set balance  =? where acc_id=?";
//			 pstmt=conn.prepareStatement(sql);
//			 pstmt.setInt(1, acc.getBalance());
//			 pstmt.setString(2, acc.getAccId());
//			 
//			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

//=================계좌 죽이기 =============
	public int delAcc(String AccId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from account where account_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, AccId);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

//	===계좌 이체===============
	public void transferMoney(String toAcc, String fromAcc, int balance) {
		int result = 0;
		int result2 = 0;
		try {
			conn();
			// 입금구문
			String sql2 = "update account set balance= balance-? where acc_id?";

			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, balance);
			pstmt.setString(1, fromAcc);

			result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("이체가 완료되었습니다.");

				if (result == 1) {//받는사람  
					String sql = "update account set balance = balance+? where acc_id=?";

					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, balance);
					pstmt.setString(1, toAcc);

					result2 = pstmt.executeUpdate();
					if (result2 == 1) {
						System.out.println("이체가 완료되었습니다.");
					} else {
						System.out.println("이체가 실패하였습니다.");
					}
				}//받는사람 구문 
			} else {

				System.out.println("입금 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}


	}

}
