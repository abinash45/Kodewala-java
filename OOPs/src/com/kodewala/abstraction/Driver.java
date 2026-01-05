package com.kodewala.abstraction;

abstract class Swiggy {

	public abstract void orderOverview();
}

class Instamart extends Swiggy {
	public void orderOverview() {
		// user details
		// order details
		// transaction
		userDetails();
		orderDetails();
		transaction();
	}

	private void userDetails() {
		System.out.println("User details");
	}

	private void orderDetails() {
		System.out.println("Order details");
	}

	private void transaction() {
		System.out.println("Transaction details");
	}

}

public class Driver {
	public static void main(String[] args) {

		Swiggy sw = new Instamart();

		sw.orderOverview();
	}

}
