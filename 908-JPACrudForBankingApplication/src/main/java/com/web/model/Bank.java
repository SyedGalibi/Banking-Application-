package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private long accountNumber;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobileNumber;
	private double deposit;
	private double withdraw;
	private int status;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(long accountNumber, String name, String password, double amount, String address, long mobileNumber,
			double deposit, double withdraw,int status) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.status=status;
		
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password + ", amount="
				+ amount + ", address=" + address + ", mobileNumber=" + mobileNumber + ", deposit=" + deposit
				+ ", withdraw=" + withdraw + "]";
	}
	
	
	

}
