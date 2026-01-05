package com.kodewala.polymerphisim.restaurant_billing_system;

public class Driver {

    public static void main(String[] args) {

        RestaurantBill bill = new RestaurantBill(788.0);

        System.out.println("Bill (Food Only): ₹" + bill.calculateBill());
        System.out.println("Bill (Food + Tax): ₹" + bill.calculateBill(50.0));
        System.out.println("Bill (Food + Tax + Service): ₹" + bill.calculateBill(50.0, 100.0));
    }
}
