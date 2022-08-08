package com.bank.acc;

import java.sql.Date;

public class AccDTO {
	private String accId;
	private	String memberId;
	private	int    balance;
	private	Date chreate_hire;

	public AccDTO(){super();}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Date getChreate_hire() {
		return chreate_hire;
	}

	public void setChreate_hire(Date chreate_hire) {
		this.chreate_hire = chreate_hire;
	}

	@Override
	public String toString() {
		return "AccDTO [accId=" + accId + ", memberId=" + memberId + ", balance=" + balance + ", chreate_hire="
				+ chreate_hire + "]";
	}
	
	
	
}
