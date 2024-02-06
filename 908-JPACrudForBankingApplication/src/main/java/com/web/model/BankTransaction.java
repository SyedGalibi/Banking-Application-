package com.web.model;

public class BankTransaction {
	private double depositamount;
	private double withdrawamount;
	private double transferamount;
	private long accountNumber2;
	private String password;
	private int status;
	public BankTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankTransaction(double depositamount, double withdrawamount, double transferamount, long accountNumber2,
			String password, int status) {
		super();
		this.depositamount = depositamount;
		this.withdrawamount = withdrawamount;
		this.transferamount = transferamount;
		this.accountNumber2 = accountNumber2;
		this.password = password;
		this.status = status;
	}
	public double getDepositamount() {
		return depositamount;
	}
	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}
	public double getWithdrawamount() {
		return withdrawamount;
	}
	public void setWithdrawamount(double withdrawamount) {
		this.withdrawamount = withdrawamount;
	}
	public double getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(double transferamount) {
		this.transferamount = transferamount;
	}
	public long getAccountNumber2() {
		return accountNumber2;
	}
	public void setAccountNumber2(long accountNumber2) {
		this.accountNumber2 = accountNumber2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BankTransaction [depositamount=" + depositamount + ", withdrawamount=" + withdrawamount
				+ ", transferamount=" + transferamount + ", accountNumber2=" + accountNumber2 + ", password=" + password
				+ ", status=" + status + "]";
	}
	

}
