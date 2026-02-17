package com.kodewala.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList <String>();
		products.add("Tv");
		products.add("Fan");
		products.add("Laptop");
		System.out.println("Electronics Product :"+ products);
		System.out.println("First Product:"+products.get(0));
		products.remove("Fan");
		System.out.println(products);
		System.out.println("After remove the product the size is :"+products.size());
		

	}

}
