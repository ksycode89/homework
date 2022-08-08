package com.bank.loan;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.bank.member.BankMemberService;



public class LoanService {

	Scanner scn = new Scanner(System.in);

	public void insertLoan() {
		LoanDTO loan = new LoanDTO();
		System.out.println("대출 id ");
		String loanId = scn.nextLine();
		System.out.println("회원 id");
		String memberId = scn.nextLine();
		System.out.println("대출 금액");
		int loanMoney = Integer.parseInt(scn.nextLine());
		System.out.println("대출 상태");
		String loanState = scn.nextLine();
		
		System.out.println("대출 날짜 ");
		
		String startDay = scn.nextLine();
		
//		Date date= null;
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//		try {
//			date=(java.sql.Date)dateFormat.parse(startDay);
//		} catch (Exception e) {
//		e.printStackTrace();
//		}
			

		loan.setLoanId(loanId);
		loan.setMember_id(memberId);
		loan.setLoanMoney(loanMoney);
		loan.setLoan_state(loanState);
		
		loan.setLoan_date(startDay);

		int result = LoanManage.getInstance().insertLoan(loan);
		if (result == 1) {
			System.out.println("대출 완료");
		} else {
			System.out.println("대출실패");
		}

	}
//상태변경
	public void updateLoan() {
		LoanDTO loan = new LoanDTO();
		System.out.println("대출 id 입력");
		String loanId = scn.nextLine();
		System.out.println("상태 변경 ");
		String loanState = scn.nextLine();
		
		loan.setLoanId(loanId);
		loan.setLoan_state(loanState);
		 
		LoanManage.getInstance().updateLoan(loan);
		
		
	}
	//상환 //
	public void returnMoney() {
		LoanDTO loan = new LoanDTO();
		System.out.println("대출 id 입력");
		String loanId = scn.nextLine();
		System.out.println("상환 금액");
		int loanMoney = Integer.parseInt(scn.nextLine());
		
		loan.setLoanId(loanId);
		loan.setLoanMoney(loanMoney);
//		System.out.println("check1");
//		System.out.println(loan.toString());
		int result = LoanManage.getInstance().loanReturn(loan);
//		System.out.println("chek3");
		if (result == 1) {
			System.out.println("상환 완료");
		} else {
			System.out.println("상환 실패");
		}
	}
	//정보조회//
	public void loanInfo() {
		List<LoanDTO> list = 
						LoanManage.getInstance().getLoanInfo(BankMemberService.memberInfo.getMemberId());
		System.out.println(BankMemberService.memberInfo.getMemberId());
		System.out.println(BankMemberService.memberInfo.getMemberName()+"님의 대출정보");
		
		for(LoanDTO loan : list) {
			System.out.println("대출 id : "+loan.getLoanId());
			System.out.println("대출 금액 : "+loan.getLoanMoney());
			System.out.println("대출 날짜 : "+loan.getLoan_date());
			
		}
		
	}
	
	
}
