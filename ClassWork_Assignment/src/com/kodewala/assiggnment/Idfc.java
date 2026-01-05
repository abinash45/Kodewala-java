package com.kodewala.assiggnment;

class BankAccount{
	private double balance = 9000.00;
	private String pin= "Ab123";
	BankAccount(double balance ,String pin){
		this.balance=balance;
		this.pin=pin;
	}
	
	/*public double getBalance(String enteredPin , double amount) {
		if (enteredPin.equa
				ls(pin)) {
			
		}
		
		return balance;
	} */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
public class Idfc {

	public static void main(String[] args) {
		

	}

}
