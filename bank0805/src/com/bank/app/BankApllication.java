package com.bank.app;

//int menu = Integer.parseInt(scn.nextLine());	
//String a = scn.nextLine();

import java.util.Scanner;
import com.bank.member.BankMemberService;

public class BankApllication {
	BankMemberService bms = new BankMemberService();
	
	Scanner scn = new Scanner(System.in);
	int menu  = 0;
	
	public BankApllication(){
		run();
	}
	
	private void run() {
	System.out.println("1. 로그인 2. 종료");
	menu = Integer.parseInt(scn.nextLine());	
	switch (menu) {
	case 1 ://로긴
		
		bms.doLogin();
		System.out.println(BankMemberService.memberInfo.getMemberName()
				+"으로 로그인합니다.");
		if(BankMemberService.memberInfo!=null) {
			new managMent();
		}
		
		
		
		break;
	case 2 :
		System.out.println("종료합니다.");
		break;
	default:
		break;
	}
	
	}
}
