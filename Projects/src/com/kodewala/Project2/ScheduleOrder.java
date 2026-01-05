package com.kodewala.Project2;

public class ScheduleOrder extends Order {

    private String deliveryDateTime;

    public ScheduleOrder(String orderId, String restaurantName,
                         double orderAmount, String deliveryDateTime) {
        super(orderId, restaurantName, orderAmount);
        this.deliveryDateTime = deliveryDateTime;
    }

    @Override
    public double calculateFinalAmount() {
        return getOrderAmount();
    }

    public void showScheduledDetails() {
        showOrderDetails();
        System.out.println("Scheduled For: " + deliveryDateTime);
        System.out.println("Final Amount: ₹" + calculateFinalAmount());
    }
}
