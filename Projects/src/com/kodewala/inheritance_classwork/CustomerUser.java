package com.kodewala.inheritance_classwork;

public class CustomerUser extends User {

    // THIS CONSTRUCTOR MUST EXIST
    public CustomerUser(String name, String email) {
        super(email, name, "CUSTOMER");
    }

    public void showCustomerDetails() {
        System.out.println("Customer Name: " + getName());
        System.out.println("Customer Email: " + getEmail());
        showBasicInfo();
    }
}
