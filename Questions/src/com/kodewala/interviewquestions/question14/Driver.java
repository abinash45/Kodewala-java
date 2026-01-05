package com.kodewala.interviewquestions.question14;

public class Driver {

	public static void main(String[] args) {
		PaymentService ps = new CardPayment();
		ps.processPayment();
		ps.refundPayment();
	}

}
/*
 * 
 * Private methods are helper methods used inside default or static methods.
 * 
 * Why useful?
 * 
 * Avoids code duplication
 * 
 * Improves readability
 * 
 * Keeps helper logic hidden
 * 
 * 
 * 
 * 
 * 
 * 
 */