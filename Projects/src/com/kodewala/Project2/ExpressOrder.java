package com.kodewala.Project2;

public class ExpressOrder extends Order {

    private double expressCharge = 50;

    public ExpressOrder(String orderId, String restaurantName, double orderAmount) {
        super(orderId, restaurantName, orderAmount);
    }

   
    
    public double calculateFinalAmount() {
        return getOrderAmount() + expressCharge;
    }

    public void showExpressDetails() {
        showOrderDetails();
        System.out.println("Express Charge: ₹" + expressCharge);
        System.out.println("Final Amount: ₹" + calculateFinalAmount());
    }
}
