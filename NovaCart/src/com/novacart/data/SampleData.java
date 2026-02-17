package com.novacart.data;

import com.novacart.model.Product;
import com.novacart.service.ProductService;

public class SampleData {

	public static void loadProducts(ProductService service) {

		service.addProduct(new Product(1, "Laptop", 75000, 5));
		service.addProduct(new Product(2, "Phone", 30000, 10));
		service.addProduct(new Product(3, "Headphones", 2000, 20));
		service.addProduct(new Product(4, "Keyboard", 1500, 15));
	}
}