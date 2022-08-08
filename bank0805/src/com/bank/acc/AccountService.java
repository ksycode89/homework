package com.bank.acc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bank.loan.LoanDTO;
import com.bank.member.BankMemberService;

public class AccountService {
	Scanner scn = new Scanner(System.in);

//개좌개설 ===============================
	public void makeAcc() {
		AccDTO ac = new AccDTO();

		System.out.println("계좌 번호 ");
		String accid = scn.nextLine();
		System.out.println("고객 id");
		String memid = scn.nextLine();

		ac.setAccId(accid);
		ac.setMemberId(memid);
		
	AccManage.getInstance().insertAcc(ac);

	}
	//입출금 계좌 해지 계좌 이체================================
	public void money() {
		AccDTO acc = new AccDTO();
		System.out.println("1.입금 2.출금");
		int cmd = Integer.parseInt(scn.nextLine());
		
		System.out.println("계좌번호");
		String accid = scn.nextLine();
		//입금=============
		if(cmd ==1) {
			System.out.println("입금 금액");
		
		//c출금============
		}else if(cmd ==2) {
			System.out.println("출금 금액");
		}
		
		int moeny = Integer.parseInt(scn.nextLine());
		acc.setAccId(accid);
		acc.setBalance(moeny);
		
		int result = AccManage.getInstance().updateMoney(acc, cmd);
		
		if(result ==1&&cmd==1) {
			System.out.println("입금 완료");
		}else if (result ==1&&cmd==2) {
			System.out.println("출금 완료");
			
		}
	}
//=======================계좌 해지 =======================/
	public void deleteAcc() {
		System.out.println("계좌 해지를 시작합니다.");
		System.out.println("계좌 입력");
		String accid = scn.nextLine();
		
		int result = AccManage.getInstance().delAcc(accid);
		
		if(result==0) {
			System.out.println("삭제 성공.");
			
		}else {System.out.println("삭제 실패");}
		
		
		System.out.println();
		
	}
//	============계좌 이체 ==============
	public void transfer() {
		System.out.println("계좌 이체");
		
		System.out.println("받는 사람 계좌");
		String toAccid =scn.nextLine();
		System.out.println("보내는 사람 계좌");
		String fromAccid = scn.nextLine();
		System.out.println("출금 금액");
		int balance = Integer.parseInt(scn.nextLine());
		
		AccManage.getInstance().transferMoney(toAccid, fromAccid, balance);
		
		
		
		
	}
//=====계좌 조회========
	
	public void check() {
		System.out.println("계좌 조회를 시작합니다.");
		
		System.out.println("계좌를 입력해주세");
		String accid = scn.nextLine();
		
		System.out.println(AccManage.getInstance().checkAcc(accid).toString());
		AccManage.getInstance().checkAcc(accid);
		
		
		
		
	}
	//계좌 조회 (new)==
	public void getAcc() {
		List<AccDTO> list = 
				AccManage.getInstance().getAcc(BankMemberService.memberInfo.getMemberId());
		System.out.println(BankMemberService.memberInfo.getMemberName());
		for(AccDTO acc : list) {
			System.out.println("계좌 Id"+acc.getAccId());
			System.out.println("잔고"+acc.getBalance());
			System.out.println("생성일"+acc.getChreate_hire());
		}
	}
	
//===계좌 등록 ====
	

	
}
