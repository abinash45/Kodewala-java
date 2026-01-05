package com.kodewala.classwork;

 class ChildBank{
	 private double balance = 9000.00;
	 private String pin = "Ab123";
	 
	 public void withdraw (String enteredPin , double amountToWithdraw) {
		 System.out.println("The current balance is :"+ balance);
		 if (enteredPin.equals(pin) && balance >= amountToWithdraw) {
			 balance = balance - amountToWithdraw;
			 System.out.println("Balance after withdraw :"+ balance);
			 
		 }
		 else {
			 System.out.println("Error : Inccorect PIN or insufficent funds");
		 }
	 }
	public void deposite (double amount , String enteredPin) {
		if (enteredPin.equals(pin)) {
		System.out.println("The current amount is :"+ balance);
		balance = balance +amount;
		System.out.println(amount+ "deposited .New balance:"+balance);
			
		}
		else {
			System.out.println("Error incorrect pin");
		}
	}
}
public class ParentBank {

	public static void main(String[] args) {
		ChildBank cb = new ChildBank ();
		//cb.balance = 124000; cant access a private variable outside the class
		cb.deposite(2000.00, "Ab123");
		cb.withdraw( "Ab123",8900.00);

	}

}
