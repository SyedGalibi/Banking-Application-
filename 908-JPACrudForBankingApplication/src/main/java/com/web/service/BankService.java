package com.web.service;

import java.util.List;


import com.web.model.Bank;
import com.web.model.BankTransaction;

public interface BankService {
	public Bank createAccount(Bank bank);
	public List<Bank> getAccount();
	public Bank getOneAccount(Bank bank,long accountNumber);
	public Bank withdraw(Bank bank,long accountNumber);
	public Bank transer(BankTransaction banktransaction,Bank bank);
	public Bank close(Bank bank,long accountNumber);
	public Bank getAmmount(Bank bank,long accountNumber);
	public Bank getdatabaseAmmount(Bank bank,long accountNumber);
	Bank getOneAccount(long accountNumber);
	Bank withdraw(long accountNumber, Bank bank);
	
	
	
	

}
