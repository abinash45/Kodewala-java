package com.kodewala.exceptions;

public class BankAccount {
	double balance = 5000;

	void withdraw(double amount) {
		if (amount > balance) {
			throw new ArithmeticException("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdrawal successful. Remaining balance:" + balance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		acc.withdraw(800);
	}

}
