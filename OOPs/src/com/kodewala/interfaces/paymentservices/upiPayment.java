package com.kodewala.interfaces.paymentservices;

public class upiPayment implements OnlinePayment {

	@Override
	public void pay(double amount) {
	 System.out.println("Paid "+amount +"Using UPI");	
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunnded"+amount+"to bank account");
		
	}

	@Override
	public void generateReceipt() {
		System.out.println("receipt generatd");
		
	}

}
