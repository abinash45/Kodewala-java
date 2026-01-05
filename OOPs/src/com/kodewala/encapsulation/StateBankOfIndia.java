package com.kodewala.encapsulation;

public class StateBankOfIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccountUser sa = new SavingsAccountUser (2000);
		sa.deposite(2000);
		sa.withdraw(800);
		System.out.println("Final Balance :"+sa.getBalance());

	}

}
