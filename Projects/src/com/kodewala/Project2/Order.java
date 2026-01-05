package com.kodewala.Project2;
public class Order {

    private String orderId;
    private String restaurantName;
    private double orderAmount;

    static int totalOrders = 0;

    public Order(String orderId, String restaurantName, double orderAmount) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.orderAmount = orderAmount;
        totalOrders++;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    
    public double calculateFinalAmount() {
        return orderAmount;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Base Amount: ₹" + orderAmount);
    }
}
