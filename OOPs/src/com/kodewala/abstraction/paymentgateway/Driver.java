package com.kodewala.abstraction.paymentgateway;

public class Driver {

	public static void main(String[] args) {
		Payment payment;
		payment = new UPIPayment ();
		payment.processPayment();
		
		System.out.println("===========");
		payment = new CreditCardPayment ();
		payment.processPayment ();

	}
	
	

}
