package com.bank.loan;

import java.sql.Date;

public class LoanDTO {
	private String loanId;
	private String member_id;
	private String loan_date;
	private String loan_state;
	private int loanMoney;
	private String memberName;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public LoanDTO() {
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getLoan_date() {
		return loan_date;
	}

	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}

	public String getLoan_state() {
		return loan_state;
	}

	public void setLoan_state(String loan_state) {
		this.loan_state = loan_state;
	}

	public int getLoanMoney() {
		return loanMoney;
	}
	
	public void setLoanMoney(int loanMoney) {
		this.loanMoney = loanMoney;
	}
	@Override
	public String toString() {
		return "LoanDTO [loanId=" + loanId + ", member_id=" + member_id + ", loan_date=" + loan_date + ", loan_state="
				+ loan_state + "]";
	}


}
