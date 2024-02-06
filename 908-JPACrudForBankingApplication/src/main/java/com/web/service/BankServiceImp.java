package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.model.BankTransaction;
import com.web.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
	@Autowired
	public BankRepo repo;

	@Override
	public Bank createAccount(Bank bank) {
	return	repo.save(bank);
		
	}
	@Override
	public Bank getOneAccount(long accountNumber) {
		
		return  repo.findById(accountNumber).get();
	}
	@Override
	public Bank getdatabaseAmmount(Bank bank,long accountNumber) {
	Bank b=	repo.findById(accountNumber).get();
	double a=b.getAmount();
	 double totalbalance=a+bank.getDeposit();
	bank.setAmount(totalbalance);
		return repo.save(bank);
	}
	
		@Override
	public Bank withdraw(long accountNumber,Bank bank) {
		Bank b=	repo.findById(accountNumber).get();
		double a=b.getAmount();
		
		if(a>bank.getWithdraw()) {
			double total=a-bank.getWithdraw();
			bank.setAmount(total);
			}
		else 
		{
			System.out.println("Insufficient Funds");
			
		}
		
		return  repo.save(bank);
	}
		@Override
		public Bank transer(BankTransaction banktransaction, Bank bank) {
			Optional<Bank> dbaccountNumber1=repo.findById(bank.getAccountNumber());
			Bank a1=dbaccountNumber1.get();
			a1.setAmount(a1.getAmount()-banktransaction.getTransferamount());
			
			repo.save(a1);
			Optional<Bank> dbaccountNumber2=repo.findById(banktransaction.getAccountNumber2());
			Bank a2=dbaccountNumber2.get();
			a2.setAmount(a2.getAmount()+banktransaction.getTransferamount());

			
					return repo.save(a2);
		}
		 @Override
			public Bank close(Bank bank,long accountNumber) {
				Optional<Bank> b= repo.findById(bank.getAccountNumber());
				Bank b1=b.get();
				int original=b1.getStatus();
				if(original==1) {
					b1.setStatus(original);
				}
				else {
					b1.setStatus(0);
				}
				
                     return repo.save(b1);
			}
	
		
		
	@Override
	public List<Bank> getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

   
	@Override
	public Bank getAmmount( Bank bank,long accountNumber) {
Bank bank1=repo.findById(accountNumber).get();
		return bank1;
	}
	
	
	@Override
	public Bank getOneAccount(Bank bank, long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Bank withdraw(Bank bank, long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
