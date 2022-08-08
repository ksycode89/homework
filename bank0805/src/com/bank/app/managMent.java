package com.bank.app;

import java.util.Scanner;

import com.bank.acc.AccountService;
import com.bank.loan.LoanDTO;
import com.bank.loan.LoanService;
import com.bank.member.BankMemberService;

public class managMent {
	Scanner scn = new Scanner(System.in);
	BankMemberService bbs = new BankMemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();
	int menu = 0;

	managMent() {
		bankJob();
	}

	private void bankJob() {
		while (true) {
			menuInfo();
			if (BankMemberService.memberInfo.getRoles().equals("1")) {
				if (menu == 1) {// 고객 입력//
					bbs.registerCustomer();
				} else if (menu == 2) {// 계좌 개설
					as.makeAcc();
				} else if (menu == 3) {// 입출금
					as.money();
				} else if (menu == 4) {
					as.transfer();
				} else if (menu == 5) {
					as.deleteAcc();
				} else if (menu == 6) {
					System.out.println("1.대출 2.상태변경");
					int menu = Integer.parseInt(scn.nextLine());
					if (menu == 1) {
						ls.insertLoan();
					} else if (menu == 2) {
						ls.updateLoan();
					}
				}

			} else if (BankMemberService.memberInfo.getRoles().equals("0")) {
				switch (menu) {
				case 1:
					// 계좌 조회
					as.check();//내가만든거
					as.getAcc();
					break;
				case 2:
					as.money();
					break;
				case 3:
					as.transfer();
					break;
				case 4:

					System.out.println("1.상환 |2.대출 조회");
					int menu = Integer.parseInt(scn.nextLine());
//					System.out.println("chek2");
					if (menu == 1) {
						ls.returnMoney();
						System.out.println("완료");
						break;
					} else if (menu == 2) {
						ls.loanInfo();
						break;
					}
					
				}//end switch

			}

		}
	}

	private void menuInfo() {
		if (BankMemberService.memberInfo.getRoles().equals("1")) {
			System.out.println("1.고객등록 2.계좌 개설 3.입출금 4.계좌 이체 " + "5. 계좌 해지 6.대출");
		} else if (BankMemberService.memberInfo.getRoles().equals("0")) {
			System.out.println("1.계좌 조회 2.입출금 3.이체 4.대출");

		}
		System.out.println("입력");
		menu = Integer.parseInt(scn.nextLine());

	}

}
