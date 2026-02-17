package com.kodewala.arraylist;

class ProductDetails {
	String searchString ;

	public ProductDetails(String searchString) {
		
		this.searchString = searchString;
	}
	
}
public class Product {

	public static void main(String[] args) {
		
		String s1 = "Abinash";
		String s2 = "Abinash";
		
		ProductDetails p1 = new ProductDetails ("Phone");
		ProductDetails p2 = new ProductDetails("Phone");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));//memory address and it is false 
		
		System.out.println(s1.equals(s2));      
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());      
	}

}
