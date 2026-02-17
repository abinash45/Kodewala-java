package com.cartzy.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cartzy.entity.Product;
import com.cartzy.exception.OutOfStockException;

public class CartService {

	private Map<Product, Integer> cart = new HashMap<>();

	// add product to cart 
	
	public void addCart(Product product , int quantity) throws OutOfStockException {
		if(quantity > product.getStock()) {
			throw new OutOfStockException ("Not enough stock for " + product.getName());
		}
		cart.put(product, cart.getOrDefault(product, 0)+ quantity);
		System.out.println(quantity +" x " +product.getName()+ "added to cart");
	}

	// remove product from cart
	public void removeFromCart(Product product) {
		if(cart.containsKey(product)) {
			cart.remove(product);
			System.out.println(product.getName() + "removed from cart");
		} else {
			System.out.println(product.getName() +" is not in the cart");
		}
	}
	
	// update the quantity 
	
	public  void updateQuatity(Product product , int quantity) throws OutOfStockException {
		if(quantity > product.getStock()) {
			throw new OutOfStockException ("Not enough stock for " + product.getName());
		}
		cart.put(product , quantity);
	}
	
	// view cart items 
	
	public void viewCart () {
		if(cart.isEmpty()) {
			System.out.println("Cart is empty.");
			return;
		}
		System.out.println("Your cart : ");
		for(Entry<Product,Integer> entry : cart.entrySet()) {
			Product product = entry.getKey();
			int quantity = entry.getValue ();
			System.out.println(product.getName() + " x " + quantity + " =" + (product.getPrice()*quantity));
		
	 }
		System.out.println("Total : " +getTotalPrice());
	}
	// calculate the total price 
	public double getTotalPrice () {
		double total =0;
		for(Product product : cart.keySet()) {
			int quantity = cart.get(product);
			total = total + product.getPrice() * quantity;
		}
		return total;
	}
	
	// check out 
	
	public void checkOut() throws OutOfStockException {
		  if(cart.isEmpty()) {
			  System.out.println("Cart is empty. Nothing is present inside !");
			  return;
		  }
		   for(Product product : cart.keySet()){
			   int quantity = cart.get(product);
			   
			   // checking for stock
			   if (quantity > product.getStock()) {
				   throw new OutOfStockException("Not enough quantity avilable for" + product.getName());
			   }
			   product.setStock(product.getStock()-quantity);
		   }
		   
		   System.out.println("Check out successful! Toatal :" + getTotalPrice());
	}
}
