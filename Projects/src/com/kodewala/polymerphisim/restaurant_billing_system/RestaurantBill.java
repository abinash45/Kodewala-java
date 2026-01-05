package com.kodewala.polymerphisim.restaurant_billing_system;

public class RestaurantBill extends Bill {

    public RestaurantBill(double foodPrice) {
        super(foodPrice);
    }

    public double calculateBill() {
        return getFoodPrice();
    }

    public double calculateBill(double tax) {
        return getFoodPrice() + tax;
    }

    public double calculateBill(double tax, double serviceCharge) {
        return getFoodPrice() + tax + serviceCharge;
    }
}
