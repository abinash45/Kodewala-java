package com.kodewala.linkedlist;

import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {
		LinkedList <String> products = new LinkedList <String>();
		products.add("Laptop");
		products.add("Smartphone");
		products.add("Tablet");
		products.add("SmartWatch");
		System.out.println(products);
		products.addFirst("TV");
		products.addLast("Camera");
		products.remove("Tablet");
		System.out.println(products);
		
		
		
	}

}
