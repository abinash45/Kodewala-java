package com.kodewala.inheritance_project1;

public class ElectronicsProduct extends Product{
	private int warrentyYears;
	private double gst = 0.18;
	ElectronicsProduct ( String productName ,double price ){
		super (productName,price);
		
	}
	public double calculateFinalPrice () {
		return getPrice () +(getPrice () * gst);
	}
	
	public void showElectronicsDetails () {
		productDetails  ();
		System.out.println("Warranty: " + warrentyYears+ " years");
        System.out.println("Final Price (with GST): " + calculateFinalPrice());
    
	}
	
	

}
