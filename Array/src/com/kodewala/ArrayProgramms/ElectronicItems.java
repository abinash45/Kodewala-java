package com.kodewala.ArrayProgramms;

public class ElectronicItems {

	public static void main(String[] args) {
		String [] products ={"Laptop","Phone","Tablet","SmartWatch","Headphones" };
        int [] prices = {55000, 25600, 18000,7500,10000 };
        
        int maxPriceIndex = 0;
        for(int i =1 ; i<prices.length;i++) {
        	if (prices[i] >prices[maxPriceIndex]) {
        		maxPriceIndex = i ;
        		
        	}
        }
        System.out.println("The product with highest price is :"+products[maxPriceIndex]+"with a price of Rs."+prices[maxPriceIndex]);
}
}