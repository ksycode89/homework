package com.bank.member;

public class MemberDTO {

		private String memberId;
		private String memberPw;
		private String memberName;
		private String memberAcc;
		private String roles; //1은행원 0 사용자
		
		//기본생성자
		MemberDTO(){super();}
		
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
		public String getMemberAcc() {
			return memberAcc;
		}
		public void setMemberAcc(String memberAcc) {
			this.memberAcc = memberAcc;
		}
		public String getRoles() {
			return roles;
		}
		public void setRole(String roles) {
			this.roles = roles;
		}

		@Override
		public String toString() {
			return "MemberDTO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
					+ ", memberAcc=" + memberAcc + ", roles=" + roles + "]";
		}
	
		
		
		
}
