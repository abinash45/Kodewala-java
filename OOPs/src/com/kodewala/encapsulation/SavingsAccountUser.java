package com.kodewala.encapsulation;

public class SavingsAccountUser {
	private double balance;
	private double amount;
	

	public SavingsAccountUser(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
	   return balance;
	}

	public void setBalance() {
		//this.balance = balance;
	}

	public void deposite(double amount) { // deposite method
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited :" + amount);
		} else {
			System.out.println("Invalid amount !");
		}
	}

	public void withdraw(double amount) { // withdraw method 
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Funds or invalid amount !");
		}
	}

}
