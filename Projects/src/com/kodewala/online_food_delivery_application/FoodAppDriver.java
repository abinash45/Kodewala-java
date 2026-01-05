package com.kodewala.online_food_delivery_application;
class PaymentService {
	void pay (double amount) {
		System.out.println("Paying amount:"+amount);
		
	}
	void  pay (double amount , double discount) {
		System.out.println("Payment amount" +(amount - discount));
	}
}

class UpiPayment extends PaymentService {
	@Override
	void pay (double amount) {
		System.out.println("UPI Payment of "+ amount+ "successful");
	}
	void pay (double amount , double discount) {
		System.out.println("Upi Payment of "+ (amount-discount)+"successful");
	}
}

class CardPayment extends PaymentService {
	@Override
	void pay(double amount) {
		System.out.println("Card payment of"+amount+"successful");
	}
	@Override
	void pay(double amount , double discount) {
		System.out.println("Card payment"+(amount-discount)+"successful");
	}
}
class ChashPayment extends PaymentService{
	@Override
	void pay(double amount) {
		System.out.println("Cash payment of"+amount+"collected");
	}
}

public class FoodAppDriver {

	public static void main(String[] args) {
		String paymentType ="UPI";
		PaymentService payment;
		
		if(paymentType.equals("UPI")) {
			payment = new UpiPayment();
		}
		else if (paymentType.equals("CARD")) {
			payment = new CardPayment ();
		}
		else {
			payment= new ChashPayment();
		}
		payment.pay(500);
		payment.pay(500,50);
	}

}
