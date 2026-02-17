package com.kodewala.hasing;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Customer {

	String name;
	String customerCode;

	public Customer(String name, String customerCode) {
		this.name = name;
		this.customerCode = customerCode;
	}

	public static void main(String[] args) {
    	Customer cust1 = new Customer ("Abinash ","C001"); 
    	Customer cust2 = new Customer ("Abinash ","C001"); 
    	
    	System.out.println(cust1.hashCode());
    	System.out.println(cust2.hashCode());
    	System.out.println(cust1.hashCode()==cust2.hashCode());
    	
    	//System.out.println(cust1.hashCode().equals(cust2.hashCode()));

    System.out.println(cust1.equals(cust2));//false
     System.out.println(cust1==cust2);//false
     
     String s1 = new String ("Ab");
     String s2 = new String ("Ab");
     
     System.out.println(s1.equals(s2)); //true
     System.out.println(s1==s2);//false
     
     
     String s3 = "Abinash";
     String s4 = "Abinash";
     System.out.println(s3.hashCode());
     System.out.println(s4.hashCode());
    }
}
