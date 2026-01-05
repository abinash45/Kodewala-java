package com.kodewala.onlinepaymentsystem;

public class OnlinePaymentSystem {

	public static void main(String[] args) {
		
		PaymentMethod payment1 = new CreditCardPayment();
        payment1.processPayment(2500);
        payment1.printReceipt();

        System.out.println();

        PaymentMethod payment2 = new UPIPayment();
        payment2.processPayment(1200);
        payment2.printReceipt();
	}

}
