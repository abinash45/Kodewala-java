package com.kodewala.encapsulation;

class Sbi {
	private double balance;
	private int pin;
	
	public Sbi (int pin , double initialBalance) {
		this.pin = pin;
		this.balance= initialBalance;
	}
	//Method to check wheteher the pin entered correct or not ! 
	private boolean verifypin (int enteredPin) {
		return this.pin == enteredPin;
	}
	//deposite amount method
	public String deposite(double amount) {
		if (amount > 0) {
			balance +=amount;
			return "Deposited:" + amount +". Current balance:" + balance;
		}
		return "Invalid deposite amount";
	}
	
	public String withdraw (double amount , int enteredPin) {
		if (!verifypin(enteredPin)) {
			return "Incorrect pin";
		}
		else if (amount <=0) {
			return "Invalid withdrawal amount.";
		}
		else if (amount > balance) {
			return "Insufficient funds";
		}
		
		balance -=amount;
		return "Withdraw: " +amount + ".Remaining balance:"+balance;
	}
	
}
public class ReserveBank {

	public static void main(String[] args) {
		Sbi s = new Sbi (1234,500.00);
		System.out.println(s.deposite(200));
		System.out.println(s.withdraw(1000.00,1234));
		System.out.println(s.withdraw(500000.00,1111));

	}

}
