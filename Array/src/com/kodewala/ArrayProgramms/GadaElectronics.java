package com.kodewala.ArrayProgramms;

public class GadaElectronics {

	public static void main(String[] args) {
		
		//creating arrays
		
		String [] productNames = {"Laptop","SmartPhone","Tablet","SmartWatch","MusicBox"};
		String [] brands = {"Lenvo","Apple","Samsung","Fitbit","Boat"};
		double [] prices = {55000.00,120000.00,35000.00,4500.00,3500.00};
		int [] stock = {2,3,4,1,6};
		
     // printing the values 
		for (int i = 0 ; i <productNames.length;i++) {
			System.out.println("Product Name :" +productNames[i]);
			System.out.println("Brand :"+brands[i]);
			System.out.println("Price :"+prices[i]);
			System.out.println("Stock :"+stock[i]+"units");
		}
		
	}

}
