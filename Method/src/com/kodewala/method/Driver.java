package com.kodewala.method;

public class Driver {
	public static void main (String []args) {
		
		//calling the method of payment class os that we can access / use members
		Payment pay = new Payment ();
		
		boolean paymentStatus = pay.doPayment("12345", 100);
		System.out.println("Paymentstatus :" + paymentStatus);
		
		paymentStatus = pay.doPayment("98393", 1234);
		System.out.println("Paymentstatus :" + paymentStatus);
		
	}

}

class Payment {
	public boolean doPayment (String account , int amount) {
		System.out.println ("Transfering fund from account :" + account);
		return false ;
	}
}
