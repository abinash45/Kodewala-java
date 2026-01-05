package com.kodewala.inheritance_project1;

public class ClothingProduct extends Product {
	//private String size;
	 String size;
	private double discount =0.23;
	ClothingProduct (String productName , double price ,String size){
		super (productName , price );
		this.size = size;
	}
	public double calculateFinalPrice () {
		return getPrice() - (getPrice()*discount);
	}
	 public void showClothingDetails() {
	        productDetails();
	        System.out.println("Size: " + size);
	        System.out.println("Final Price (after discount): " + calculateFinalPrice());
	    
}
}