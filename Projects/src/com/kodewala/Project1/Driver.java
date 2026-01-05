package com.kodewala.Project1;

class Product {
	private String name;
	private double price;
	private String brand;
	
	static int productCount =0;
	public Product (String name, double price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
		productCount++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	 public void showProductDetails() {
	        System.out.println("Product Name: " + name);
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: ₹" + price);
	        
	    }
}

class ElectronicProduct extends Product {
	 private int warrentyYears;
	 public ElectronicProduct (String name, double price, String brand, int warrentyYears) {
		 super (name,price,brand);
		 this.warrentyYears = warrentyYears;
	 }
	 public int getWarrentyYear () {
		 return warrentyYears ;
	 }
	 public void setWarrentyYears (int warrentyYears) {
		 this.warrentyYears = warrentyYears;
	 }
	 public void showElectronicDetails () {
		 showProductDetails ();
		 System.out.println("Warrenty:"+warrentyYears+"years");
	 }
}
class GroceryProduct extends Product {
	private String expiryDate;
	public GroceryProduct (String name, double price, String brand,String expiryDate) {
		super (name,price,brand);
		this.expiryDate=expiryDate;
	}
	public String getExpiryDate () {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate=expiryDate;
	}
		public void showGroceryDetails () {
			showProductDetails ();
			System.out.println("Expiry Date :"+expiryDate);
		}
		
	}

public class Driver {

	public static void main(String[] args) {
		String shopName = "SuperMart India";
		System.out.println("Welcome to:"+shopName);
		ElectronicProduct laptop = new ElectronicProduct("Laptop",55000,"Lenevo",2);
		GroceryProduct rice = new GroceryProduct ("Basmati Rice",1200,"India Gate","12/12/2025");
     
		System.out.println("Electronic Product");
		laptop.showElectronicDetails ();
		
		System.out.println("Total Products Created:"+Product.productCount);
	}

}


/*
Develop a Java program to model an E-Commerce Product System using Object-Oriented Programming concepts.
Create a base class Product with encapsulated data members.Use constructors to initialize object data.Maintain a static variable to count the number of products created.Create subclasses ElectronicProduct and GroceryProduct using inheritance.Demonstrate the use of instance variables, local variables, and static variables.Use getters and setters to access private data members.
Write a driver class to test the functionality.
*/