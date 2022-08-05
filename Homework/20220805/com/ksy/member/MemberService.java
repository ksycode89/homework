package com.ksy.member;

//맴버 로직 
public class MemberService {

//	public MemberService() {
//		run();
//	}
//
//	private void run() {
//	}

	public MemberDTO doLoing(MemberDTO member) {
		MemberDTO mem = MemberManage.getInstanceof().login(member);

		if (mem == null) {
			System.out.println("로그인 실패");
			return null;
		} else {
			System.out.println("로그인 성공");
			return mem;
		}

		

	}

}
