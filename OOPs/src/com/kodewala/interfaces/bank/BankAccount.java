package com.kodewala.interfaces.bank;

public interface BankAccount {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double checkBalance ();

}
