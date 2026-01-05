package com.kodewala.polymerphisim.restaurant_billing_system;

public class Bill {
	
	private double foodPrice;
	public Bill (double foodPrice) {
		this.foodPrice=foodPrice;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	

}
