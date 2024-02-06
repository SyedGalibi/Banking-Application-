package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Bank;
import com.web.model.BankTransaction;
import com.web.service.BankServiceImp;

@Controller
public class BankController {
	@Autowired
	public BankServiceImp service;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/newAccount")
	public String openAccount() {
		return "newAccount";
	}

	@RequestMapping("/add")
	public String openAccountDataInseted(Bank bank) {
		service.createAccount(bank);
		return "success";
	}

	@RequestMapping("/balance")
	public String openBalanceFrom(Bank bank) {

		return "balanceForm";
	}

	@RequestMapping("/deposit")
	public String getAmount() {
     return "depositForm";
	}

	@RequestMapping("/dep")
	public String openBalance(Bank bank, ModelMap model, long accountNumber) {
		model.put("b1", service.getOneAccount(accountNumber));

		return "Form";
	}

	@RequestMapping("/accountdata")
	public String getAmountDisplay(Bank bank, ModelMap model, long accountNumber) {
		System.out.println("bank--------->" + bank);
		model.put("b1", service.getdatabaseAmmount(bank, accountNumber));
		return "Displayamount";
	}

	@RequestMapping("/withdraw")
	public String openUpdateBalance() {
		
		return "withdrawForm";
	}
	
	
	@RequestMapping("/withdrawdata")
	public String withdraw(Bank bank, ModelMap model, long accountNumber) {
		model.put("b2", service.withdraw(accountNumber,bank));
       return "withdrawreturnForm";
	}

	@RequestMapping("/transfer")
	public String transfer(Bank bank) {
		return "transferForm";
	}
	@RequestMapping("/trans")
	public String transferData(Bank bank ,ModelMap model,BankTransaction banktransaction) {
		model.put("b3",service.transer(banktransaction, bank));
		
		return "transferFormUpdated";
	}

	@RequestMapping("/closeAccount")
	public String close(Bank bank) {
		return "closeForm";
	}
	@RequestMapping("/close")
	public String closeAccount(Bank bank,ModelMap model,long accountNumber) {
		model.put("b4",service.close(bank, accountNumber));
		
		return "closeUpdateForm";
	}

}
