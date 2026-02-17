package com.cartzy.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.cartzy.data.SampleProductData;
import com.cartzy.entity.Product;

public class ProductService {

	private List<Product> products;

	// constructor for product service
	// Loads the product list here in order to use the list for future
	public ProductService() {
		this.products = SampleProductData.getProducts();
	}

	// Now displaying all the products
	public void displayProducts() {

	    System.out.println("\n================= Available Products =================");

	    System.out.printf("%-5s %-15s %-12s %-8s%n", 
	            "ID", "Name", "Price", "Stock");
	    System.out.println("------------------------------------------------------");

	    for (Product p : products) {
	        System.out.printf("%-5d %-15s %-12.2f %-8d%n",
	                p.getId(),
	                p.getName(),
	                p.getPrice(),
	                p.getStock());
	    }

	    System.out.println("======================================================");
	}

	// Search product by name
	public List<Product> searchProductByName(String name) {

	    String searchValue = name.trim().toLowerCase();

	    return products.stream()
	            .filter(p -> p.getName()
	                    .equalsIgnoreCase(searchValue))
	            .toList();
	}
	// sort by value ascending order

	public void valueByAscending() {
		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}
		});
	}

	// sort value by descending order

	public void valueByDescingOrder(){
		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product p2, Product p1) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}

		});
	}
	// Get product by ID
	public Optional<Product> getProductById(int id) {
	    return products.stream()
	                   .filter(p -> p.getId() == id)
	                   .findFirst();
	}
	
}
