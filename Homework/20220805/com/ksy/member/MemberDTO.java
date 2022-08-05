package com.ksy.member;

public class MemberDTO {
	
	private String memberId;    //회원 아이디
	private String memberPw;    //회원 비밀먼호
 	private String memberName;  //회원 이름
	private String MemberSosok; //회원 소속
	
	//constructor
	public MemberDTO(){}

	//getter setter
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberSosok() {
		return MemberSosok;
	}

	public void setMemberSosok(String memberSosok) {
		MemberSosok = memberSosok;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" 
	                   + memberName+ ", MemberSosok=" + MemberSosok + "]";};
	
	
	
	
}
