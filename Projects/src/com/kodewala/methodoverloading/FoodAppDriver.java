package com.kodewala.methodoverloading;
class FoodOrder {
	
	 FoodOrder (String itemName){
		System.out.println("Order placed for item :"+itemName);
		
	}
	 FoodOrder (String itemName ,int quantity){
		 System.out.println("Order placed for item" +itemName+"and the quantity is "+quantity);
	 }
	 FoodOrder (String itemName , int quantity , String address){
		 System.out.println("Order placed for item name is "+ itemName+"Quantity"+quantity+"Delivery Address"+address);
	 }
}


public class FoodAppDriver {

	public static void main(String[] args) {
		//FoodAppDriver fad = new FoodAppDriver ();
	    FoodOrder fad1= new FoodOrder ("Laptop");
	    FoodOrder fad2= new FoodOrder ("Laptop" , 1);
	    FoodOrder fad3= new FoodOrder ("Laptop" , 1, "Bhubaneswar");
			

	}

}
