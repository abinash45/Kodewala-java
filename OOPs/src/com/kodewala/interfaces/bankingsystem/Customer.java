package com.kodewala.interfaces.bankingsystem;

public class Customer implements BankingServices, LoanServices {

	@Override
	public void deposit(double amount) {
	System.out.println("Deposited :"+amount);
	}
	

	@Override
	public void applyLoan(double amount) {
		System.out.println("Loan applied for :"+amount);
		
	}

}
