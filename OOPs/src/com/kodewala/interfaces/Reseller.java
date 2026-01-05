package com.kodewala.interfaces;

public class Reseller implements Customer {

	@Override
	public void addCustomer(String name) {
		// TODO Auto-generated method stub
		System.out.println("Adding the customer with name :"+name);
		
	}

	@Override
	public void updateCustomer(String name) {
		System.out.println("Updating the customer with name :"+ name);
		
	}

	@Override
	public void deleteCustomer(String name) {
		System.out.println("Delete the customer with name :"+name);
		
	}

}
