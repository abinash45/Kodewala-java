package com.kodewala.method;

public class Zepto {
	
	public void userDetails (String name , int id) {
		System.out.println("User of Zepto:"+ name +" Id is :"+ id);
		
	}
	public void orderDetails (String itemName , int itemId) {
		System.out.println("Product Name is :"+ itemName+" product id is :"+itemId);
	}

	public static void main(String[] args) {
		Zepto z1 = new Zepto ();
		Zepto z2 = new Zepto ();
		System.out.println("Welcome to Zepto");
		System.out.println("==================");
		z1.userDetails("Abinash", z1.hashCode());
		z2.orderDetails("CEAT Bat", z2.hashCode());

	}

}
