package com.kodewala.arraylist;

import java.util.ArrayList;

public class CustomerDetails {

	public static void main(String[] args) {
		ArrayList<String> customer = new ArrayList<String>();
		// ArrayList <Integer> id = new ArrayList <Integer>();
		customer.add("Abinash");
		customer.add("Peeyush");
		customer.add("Brajesh");
		customer.add("Abinash");
		customer.add(null);
		customer.add(null);
		System.out.println("The name of customers are :" + customer);

		System.out.println("-------------------------------------------------");
		for (int i = 0; i <= 20; i++) {
			customer.add("Customers" + i);
		}
		customer.add("Rohit");
		System.out.println(customer);

		System.out.println(
				"================================ Trying with integer type ===================================");

		ArrayList<Integer> id = new ArrayList<Integer>();
		for (int j = 0; j <= 20; j++) {

			id.add(j);
		}
		System.out.println(id);

	}
}
