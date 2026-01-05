package com.kodewala.abstraction.paymentgateway;

public class UPIPayment extends Payment{

	 @Override
	 public void processPayment() {
		 verifyUPI();
		 debitAmount();
		 generateReceipt();
	 }
	 private void verifyUPI () {
		 System.out.println("Verifying UPI ID");
	 }
	 
	 private void debitAmount () {
		 System.out.println("Debitting amount via UPI");
	 }
	 
	 private void generateReceipt () {
		 System.out.println("Generating UPI receipt");
	 }
}
