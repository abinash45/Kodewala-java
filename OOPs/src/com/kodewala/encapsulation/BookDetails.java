package com.kodewala.encapsulation;

class Book {
	
	private String title ;
	private String author;
	private double price;
	private boolean status;
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	//private boolean status;
	

Book(String title , String author, double price, boolean status){
 this.title=title;
 this.author=author;
 this.price=price;
 this.status=status;
	
} 

public void display() {
	 System.out.println("------ Book Details ------");
	    System.out.println("Title: " + title);
	    System.out.println("Author name: " + author);
	    System.out.println("Price: " + price);
	    System.out.println("Status: " + status);
	   
	
}

}

public class BookDetails {

	public static void main(String[] args) {
		Book b = new Book ("Iron Man ","Spiderman",20.0,false);
		b.display();
		System.out.println("Displaying the details ");
		

	}

}
