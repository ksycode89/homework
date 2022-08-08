package com.bank.member;

import java.util.Scanner;

import com.bank.acc.AccDTO;

public class BankMemberService {
	Scanner scn = new Scanner(System.in);
	//비밀번호 저장공간 stac에 올라감
	public static MemberDTO memberInfo = null;
	
	//로그인
	public void doLogin() {
		MemberDTO member = new MemberDTO();
		System.out.println("로그인을 시작합니다.");
		System.out.println("id 입력");
		String id = scn.nextLine();
		System.out.println("pw 입력");
		String pw = scn.nextLine();
		
		member=BankMemberManage.getInstance().loginInfo(id);
	
		if(member.getMemberPw().equals(pw)) {
			System.out.println("로그인 성공.");
			memberInfo = member;
		}else {
			
			System.out.println("로그인 실패");
		}
	//로그아웃 
	}  	
	public void doLogout() {
		if(memberInfo != null) {
		System.out.println("로그아웃 합니다.");
		memberInfo = null;
		}		
	}
	
	//고객등록
	public int registerCustomer() {
		MemberDTO member = new MemberDTO();
		System.out.println("고객 id");
		String id = scn.nextLine();
		System.out.println("고객 pw");
		String pw = scn.nextLine();
		System.out.println("고객 이름");
		String name = scn.nextLine();
		
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRoles("0");
		
		int result = BankMemberManage.getInstance().registCustomer(member);
		
		return result;
	}
	
	
}
