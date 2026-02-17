package com.kodewala.arraylist;

import java.util.ArrayList;

public class Lenevousers {

	public static void main(String[] args) {
		ArrayList<String> user = new ArrayList<String>(10);

		user.add("Abinash");
		user.add("Peeyush");
		user.add("Ayush");
		user.add("Abinash");
		user.add("Rohit");
		user.add("Virat");
		user.add("Rahul");
		user.add("Iyer");
		user.add("Ravindra");
		user.add("Jurel");
		System.out.println("The name of users are :" + user);
		user.remove(9);

		System.out.println("The name of users are :" + user);

		user.add(7, "Washington");
		System.out.println("The name of users are :" + user);
		user.add("Shami");
		System.out.println("The name of users are :" + user);
		user.remove(1);
		System.out.println("The name of users are :" + user);
		
	}
}
