package com.kodewala.onlinepaymentsystem;

public class UPIPayment extends PaymentMethod {

	UPIPayment() {
		super("upi");
		
	}

	@Override
	void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("UPI payment successful.");
    }
}

