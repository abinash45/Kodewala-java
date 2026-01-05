package com.kodewala.interviewquestions.question20;

class UPIPayment implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
