package com.kodewala.covariant.example;

public class Driver {

    public static void main(String[] args) {

        // Parent reference, child object
        OrderService service = new UPIOrderService();

        Receipt receipt = service.placeOrder("Pizza", 500);
        receipt.printReceipt();

        // Downcasting to access child behavior
        UPIReceipt upi = (UPIReceipt) receipt;
        upi.upiDetails();

        System.out.println("--------------------");

        service = new CardOrderService();

        Receipt cardReceipt = service.placeOrder("Burger", 300);
        cardReceipt.printReceipt();

        CardReceipt card = (CardReceipt) cardReceipt;
        card.cardDetails();
    }
}
