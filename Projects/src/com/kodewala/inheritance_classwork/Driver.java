package com.kodewala.inheritance_classwork;

public class Driver {

    public static void main(String[] args) {

        AdminUser admin = new AdminUser("Abinash", "abinash@gmail.com");
        CustomerUser customer = new CustomerUser("Ravi", "ravi@gmail.com");

        System.out.println("----- Admin user -----");
        admin.showAdminDetails();

        System.out.println("----- Customer user -----");
        customer.showCustomerDetails();
    }
}
