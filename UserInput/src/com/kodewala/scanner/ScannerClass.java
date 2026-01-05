package com.kodewala.scanner;

import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Welcome To Zepto ===");
		
		String userName = sc.next();
		System.out.println("Your name is :" + userName);
		String productName = sc.next();
		System.out.println("Product name is :" + productName);
		int price;
		while (true) {
			System.out.println("Please Enter The Price :");
			if (sc.hasNextInt()) {
				price = sc.nextInt();
				break;
			}
			else {
				System.out.println("Invalid input.. pls try again");
				sc.next();
			}
		}

		sc.close();

	}
	

}
