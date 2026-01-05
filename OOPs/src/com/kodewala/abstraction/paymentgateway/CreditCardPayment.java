package com.kodewala.abstraction.paymentgateway;

 class CreditCardPayment extends Payment {

	// @Override
	 public void processPayment () {
		 validateCard();
		 debitAmount ();
		 generateReceipt ();
	 } 
	 private void validateCard() {
		 System.out.println("Validating credit card");
	 }
	 private void debitAmount () {
		 System.out.println("Debiting amount via credit card");
	 }
	 private void generateReceipt () {
		 System.out.println("Generating credit card receipt");
	 }
}
