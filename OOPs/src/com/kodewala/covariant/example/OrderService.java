package com.kodewala.covariant.example;

// Parent service class
public class OrderService {

    public Receipt placeOrder(String item, int price) {
        System.out.println("Placing generic food order for: " + item);
        return new Receipt();
    }
}

// Child service using covariant return type
class UPIOrderService extends OrderService {

    @Override
    public UPIReceipt placeOrder(String item, int price) {
        System.out.println("Placing UPI food order for: " + item);
        return new UPIReceipt(); // covariant return
    }
}

// Another child service using covariant return type
class CardOrderService extends OrderService {

    @Override
    public CardReceipt placeOrder(String item, int price) {
        System.out.println("Placing Card food order for: " + item);
        return new CardReceipt(); // covariant return
    }
}
