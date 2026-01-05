package com.kodewala.onlinepaymentsystem;

abstract class PaymentMethod {
	String methodType;
	PaymentMethod (String methodType){
		this.methodType= methodType;
	}
	
	abstract void processPayment (double amount);
 
	void printReceipt() {
		System.out.println("Payment method :"+ methodType);
		System.out.println("Transaction Completed Successfully");
	}
}
