package com.bank.loan;

import java.util.ArrayList;
import java.util.List;

import com.bank.common.DAO;
import com.bank.member.MemberDTO;

public class LoanManage extends DAO {

	private static LoanManage lm = null;

	private LoanManage() {
	};

	public static LoanManage getInstance() {
		if (lm == null) {
			lm = new LoanManage();

		}
		return lm;
	}

//	1.은행원 1; 대출승인 / 2. 대출정보변경(y,n)
//	2.고객 :  1.상환 2. 대출 조회

	// 대출 승인&완료
	public int insertLoan(LoanDTO loan) {
		int result = 0;
		try {
			conn();
			String sql = "insert into loan values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getLoanId());
			pstmt.setString(2, loan.getMember_id());
			pstmt.setString(3, loan.getLoan_date());
			pstmt.setString(4, loan.getLoan_state());
			pstmt.setInt(5, loan.getLoanMoney());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

///=====대출정보 변경 =============///
	public int updateLoan(LoanDTO loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set loan_state =? where loan_id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getLoan_state());
			pstmt.setString(2, loan.getLoanId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

//==========고객 대출 상환 ============	
	public int loanReturn(LoanDTO loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set loan_money =loan_money-? where loan_id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loan.getLoanMoney());
			pstmt.setString(2, loan.getLoanId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}
//==========대출 조회==============

	public List<LoanDTO>getLoanInfo(String memberInfo) {
		List<LoanDTO> list = new ArrayList<>();
		LoanDTO loan = null;
		try {
			conn();
			String sql = "select b.member_name ,l.loan_id ,l.loan_money ,l.loan_date\r\n"
					+ "from bank_member b join loan l\r\n"
					+ "on b.member_id = l.member_id\r\n"
					+ "where b.member_id = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, memberInfo);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				loan = new LoanDTO();
				loan.setMemberName(rs.getString("member_name"));;
				loan.setLoanId(rs.getString("loan_id"));
				loan.setLoanMoney(rs.getInt("loan_money"));
				loan.setLoan_date(rs.getString("loan_date"));
				list.add(loan);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

}// end
