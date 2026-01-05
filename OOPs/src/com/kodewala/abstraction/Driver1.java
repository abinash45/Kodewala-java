package com.kodewala.abstraction;

abstract class Amazon {
    public abstract void orderOverview();
}

class AmazonGrocery extends Amazon {

   
    @Override
    public void orderOverview() {
        userDetails();
        transactionDetails();
        invoice();
    }

    private void userDetails() {
        System.out.println("User with user details");
    }

    private void transactionDetails() {
        System.out.println("Transaction details");
    }

    private void invoice() {
        System.out.println("Invoice details");
    }
}

public class Driver1 {
    public static void main(String[] args) {

        Amazon amazon = new AmazonGrocery(); // abstraction
        amazon.orderOverview();              // method call
    }
}
