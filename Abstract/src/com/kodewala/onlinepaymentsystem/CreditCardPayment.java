package com.kodewala.onlinepaymentsystem;

public class CreditCardPayment  extends PaymentMethod{

	CreditCardPayment() {
		super("credit card");
		
	}

	@Override
	void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Credit Card payment approved.");
    }
}

