package com.Kodewala;

import java.util.ArrayList;
import java.util.List;

class Customer1 {
    String name;
    String email;
    int id;

    public Customer1(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }
}

public class CustomerTest2 {

    public static List<Customer1> getCustomers() {

        List<Customer1> customers = new ArrayList<>();

        customers.add(new Customer1("Indra", "indra@gmail.com", 8978));
        customers.add(new Customer1("Rohit", "rohit@gmail.com", 1234));

        return customers;
    }

    public static void main(String[] args) {

        List<Customer1> customerList = getCustomers();

        System.out.println("Customer list whose name ends with 'ra'");

        for (Customer1 c : customerList) {
            if (c.name.endsWith("ra")) {
                System.out.println(
                    "Name: " + c.name +
                    " Email: " + c.email +
                    " Id: " + c.id
                );
            }
        }
    }
}
