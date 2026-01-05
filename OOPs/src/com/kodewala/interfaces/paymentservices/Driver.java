package com.kodewala.interfaces.paymentservices;

public class Driver {

	public static void main(String[] args) {
		
		OnlinePayment payment = new upiPayment();
		payment.pay(500);
		payment.refund(200);
		payment.generateReceipt();

	}

}
