package com.kodewala.covariant.example;

public class Receipt {

    public void printReceipt() {
        System.out.println("Generic payment receipt");
    }
}

// Child return type
class UPIReceipt extends Receipt {

    public void upiDetails() {
        System.out.println("UPI transaction successful");
    }
}

// Child return type
class CardReceipt extends Receipt {

    public void cardDetails() {
        System.out.println("Card payment successful");
    }
}
