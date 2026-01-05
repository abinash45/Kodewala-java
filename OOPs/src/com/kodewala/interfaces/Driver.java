package com.kodewala.interfaces;

public class Driver {

	public static void main(String[] args) {
		Customer cust;
		cust = new Reseller ();
		System.out.println("------Reseller------");
		cust. addCustomer("Abinash");
         cust.updateCustomer("Rohit");
         cust.deleteCustomer("Rahul");
         
         cust = new RetailCustomer();
         System.out.println("------RetailCustomer------");
 		cust. addCustomer("Abinash");
          cust.updateCustomer("Rohit");
          cust.deleteCustomer("Rahul");
         
	}

}
