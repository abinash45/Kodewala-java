package com.Kodewala;

import java.util.ArrayList;
import java.util.List;

class Customer {
	String name;
	public Customer (String name) {
		this.name = name;
	}
}
public class CustomerTest {
	
	public static List <Customer> getCustomers (){
		List <Customer> customers = new ArrayList<>();
		
		customers.add(new Customer("Abinash"));
		customers.add(new Customer("Abinash1"));
		customers.add(new Customer("Abinash2"));
		customers.add(new Customer("Abinashra"));
	//	customers.add("Mahendra");
		
		return customers;
	
	}
	public static void main(String[] args) {
		List<Customer> customerList = getCustomers();
		System.out.println("Customers whose name ends with 'ra'");
    for (Customer c : customerList) {
    	if(c.name.endsWith("ra")) {
    		System.out.println(c.name);
    	}
    }
	}

}
