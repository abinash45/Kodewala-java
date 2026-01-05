package com.kodewala.interviewquestions.question14;

public interface PaymentService {
  default void processPayment () {
	  validate();
	  System.out.println("Payment processed");
  }
  default void refundPayment () {
	  validate();
	  System.out.println("Payment refunded");
  }
  private void validate () {
	  System.out.println("Validating");
	  
  }
}
