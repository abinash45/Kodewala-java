package com.cartzy.data;

import java.util.ArrayList;
import java.util.List;


import com.cartzy.entity.Product;

public class SampleProductData {
	public static List<Product> getProducts (){
		List<Product> products =  new ArrayList<>();
		products.add(new Product (1,"Laptop",8000.0,10));
		products.add(new Product (2,"Phone",500.0,19));
		products.add(new Product (3,"HeadPhone",300.0,30));
		products.add(new Product (4,"SmartWatch",450.0,11));
		products.add(new Product (5,"Tablet",3000.0,8));
		products.add(new Product  (6,"EarBuds",400.0,7));
		products.add(new Product  (7,"Watch",370.0,10));
		products.add(new Product  (8,"Charger",170.0,20));
		products.add(new Product  (9,"Battery",45.0,25));
		products.add(new Product  (10, "WaterBottle",370.0,10));
		
		
		return products;
	}
}
