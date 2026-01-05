package com.kodewala.exceptions;

public class ProductDescriptionCheck {

	public static void main(String[] args) {
		try {
			String productDescription = null;
			System.out.println(productDescription.trim());
		}catch (NullPointerException e) {
			System.out.println("Product description not found");
		}

	}

}
