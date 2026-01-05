package com.kodewala.interfaces.bankingsystem;

public class BankingSystem {

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.deposit(78000);
		cust.applyLoan(900000);

	}

}
