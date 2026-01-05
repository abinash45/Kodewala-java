package com.kodewala.dynamicmethoddispatch;

class Payment {
	void pay () {
		System.out.println("Processing the payment.");
	}
}
class UPIPayment extends Payment {
	@Override
	void pay () {
		System.out.println("Payment completed using UPI");
	}
}
class NetBankingPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment completed using Net Banking");
    }
}
class CardPayment extends Payment {
	@Override 
	void pay () {
		System.out.println("Payment completed using ");
	}
}
public class PaymentGatewaySystem {

	public static void main(String[] args) {
		String paymentType = "UPI";
		Payment payment;
		if (paymentType.equals("UPI")) {
			payment = new UPIPayment ();
		}
		else if (paymentType.equals("CARD")) {
			payment = new CardPayment ();
		}
		else {
			payment = new NetBankingPayment();
		}
		payment.pay();

	}

}
