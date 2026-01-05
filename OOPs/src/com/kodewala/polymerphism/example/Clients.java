package com.kodewala.polymerphism.example;

public class Clients {

	public static void main(String[] args) {
	
PaymentProcessor pp = new PaymentProcessor();
		
		CreditCard cc = new CreditCard();
		pp.processPayment(cc);
		//pp.processPayment(cc);
        
	}

}
