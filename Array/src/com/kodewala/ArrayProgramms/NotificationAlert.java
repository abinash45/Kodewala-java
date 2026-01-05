package com.kodewala.ArrayProgramms;
import java.util.*;

public class NotificationAlert {

	String name ;
	int accountNo;
	String email;
	int balance;
	
	public NotificationAlert(String name, int accountNo , String email , int balance){
		this.name = name ;
		this.accountNo = accountNo;
		this.email = email;
		this.balance= balance;
		
	}
	
	
	public NotificationAlert(String name2, String accountNo2, String email2, double balance2) {
		// TODO Auto-generated constructor stub
	}


	void displayDetails () {
		System.out.println("Name of the account holder :"+name);
		System.out.println("Account number of the account holder :"+accountNo);
		System.out.println("Name of the account holder :"+name);
		System.out.println("Name of the account holder :"+name);
		
	}
	
	 void sendNotification() {
	        System.out.println(" Alert : Dear " + name + ", your account balance is negative!");
	    }
	 boolean negativeBalanceCheck() {
		    return balance < 0;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of customers");
		int n = sc.nextInt();
		sc.nextLine();
		
		NotificationAlert [] na = new NotificationAlert [n];
		 for (int i =0; i<na.length;i++) {
			 System.out.println("Enter the details of the customer"+(i+1));
			 
			 System.out.println("Name :");
			 String name = sc.nextLine ();
			 System.out.print("Account No: ");
	            String accountNo = sc.nextLine();

	            System.out.print("Email: ");
	            String email = sc.nextLine();

	            System.out.print("Balance: ");
	            double balance = sc.nextDouble();
	            sc.nextLine(); 
	            
	            na [i] = new NotificationAlert (name, accountNo , email,balance);
	            
			 
		 }
		for (int i =0; i<na.length;i++) {
			if (na[i].negativeBalanceCheck()) {
			    na[i].displayDetails();
			    na[i].sendNotification();
			}

		}
		

	}

}
