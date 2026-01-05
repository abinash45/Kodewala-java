package com.kodewala.encapsulation;

class Atm {
	private double balance = 9000;
	private String pin = "8980";

	public void withdraw(double amountToWithdraw, String enteredPin) {
		System.out.println("Current Balance :" + balance);
		if (enteredPin.equals(pin) && amountToWithdraw <= balance) {
			balance = balance - amountToWithdraw;
			System.out.println("Balance post withdraw :" + balance);
		} else {
			System.out.println("Error");
		}
	}  

	public void deposite(double amount, String enteredPin) {
		if (enteredPin.equals(pin)) {

			balance = balance + amount;
			System.out.println(amount + "deposited. New Balance" + balance);
		} else {
			System.out.println("err"
					+ "or incorrect pin");
		}
	}
}
public class User {

	public static void main(String[] args) {
		Atm a = new Atm();
		// a.balance=12000
		a.deposite(120, "8980");
		a.withdraw(200, "8980");

	}

}
