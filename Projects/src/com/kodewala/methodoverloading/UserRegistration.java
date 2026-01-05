package com.kodewala.methodoverloading;

class User {
	User(String email){
		System.out.println("User registered using Email :"+email);
	}
	User (long mobileNumber){
		System.out.println("User registered using Mobile number :"+mobileNumber);
	}
	User (String email , long mobileNumber, String address){
		System.out.println("User's email is "+email+"User's mobile number is "+mobileNumber+"Address is "+address);
		
	}
}
public class UserRegistration {
 public static void main (String args []) {
	// UserRegistration ur = new UserRegistration ();
	 User u1 = new User("abinashn@gmail.com");

     User u2 = new User(9090908989L); // L is important

     User u3 = new User("abinashn@gmail.com",8989897867L,"Bhubaneswar");
 }
}
