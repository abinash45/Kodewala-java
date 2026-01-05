package com.kodewala.ArrayProgramms;

public class CustomerNotification {

	String name;
	int accountNumber;
	String email;
	double balance;

	CustomerNotification(String name, int accountNumber, String email, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.email = email;
		this.balance = balance;
	}

	void display() {
		System.out.println("Name of the customer is :" + name);
		System.out.println("Account number of the customer is :" + accountNumber);
		System.out.println("Email of the customer is :" + email);
		System.out.println("Balance of the customer is :" + balance);

	}

	public static void main(String[] args) {
		CustomerNotification[] arr = { new CustomerNotification("Abinash Nayak", 5933, "abinash@gmail.com", 400.0),
				new CustomerNotification("Rohit Sharma", 1433, "rohit@gmail.com", -400.0),
				new CustomerNotification("Oscar Piastri", 8766, "oscar@gmail.com", -400.0) };

		// Creating array of objects
		System.out.println("== List of the customer having negative balance ==");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].balance < 0) {
				// System.out.println("Customer having negative balance.");
				// System.out.println("The name of the customer is :"+name+"Accountnumber of")
				arr[i].display();
				System.out.println("-----------");
			}

		}

	}

}

//Develop a program to send notification to the customers who are having negative balance 
//sysout (negative balance)
//Customer :
//name , accountNo, email , balance 
//features to use Constructor loop array