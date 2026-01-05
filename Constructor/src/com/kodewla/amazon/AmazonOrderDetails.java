package com.kodewla.amazon;

public class AmazonOrderDetails {
	int orderId;
	String itemName;
	int price;
	int qty;
	int gst;
	
	public AmazonOrderDetails (int _orderId,String _itemName , int _price , int _qty , int _gst) {
		this.orderId = _orderId;
		this.itemName= _itemName;
		this.price = _price;
		this.qty=_qty;
		this.gst= _gst;
		System.out.println("OrderId :"+orderId);
		System.out.println("OrderName:"+itemName);
		System.out.println("Price :"+price);
		System.out.println("Qty :"+qty);
		System.out.println("GST :"+gst);
		System.out.println ("----------------------------");
		
	}


	public AmazonOrderDetails (int _orderId,String _itemName , int _price , int _qty ) {
		this.orderId = _orderId;
		this.itemName= _itemName;
		this.price = _price;
		this.qty=_qty;
		System.out.println("OrderId :"+orderId);
		System.out.println("OrderName:"+itemName);
		System.out.println("Price :"+price);
		System.out.println("Qty :"+qty);
		
		System.out.println ("----------------------------");
	}
	
	/*public void displayOrders () {
		System.out.println("OrderId :"+orderId);
		System.out.println("OrderName:"+itemName);
		System.out.println("Price :"+price);
		System.out.println("Qty :"+qty);
		//System.out.println("GST :"+gst);
		System.out.println ("----------------------------");
		
	} */
	public static void main(String[] args) {
	
		AmazonOrderDetails ad = new AmazonOrderDetails (1 , "Mobile" , 200000, 2 , 18);
		AmazonOrderDetails ad1 = new AmazonOrderDetails (2 , "Laptop" , 500000, 1 , 18);
		AmazonOrderDetails ad2 = new AmazonOrderDetails (3 , "Headphone" , 10000, 2 , 18);
		AmazonOrderDetails ad3 = new AmazonOrderDetails (4 , "Shoe" , 4500,2 );
		AmazonOrderDetails ad4 = new AmazonOrderDetails (5 , "Book" , 340, 1 );
		
		
		//ad.displayOrders();
		//ad1.displayOrders();
		//ad2.displayOrders();
		//ad3.displayOrders();
		//ad4.displayOrders();
		
		

	}

}
