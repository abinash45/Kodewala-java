package com.kodewala.exceptions;

public class ShoppingCartCheck {

	public static void main(String[] args) {
		try {
			String [] cartItems = {"Milk", "Bread" };
			System.out.println(cartItems[-1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid cart item");
		}

	}

}
