package com.kodewala.scanner;

import java.util.*;

public class Zepto {
	public static void main(String[] args) {
		String employeeName;
		int employeeId;
		int age;
		int salary;
		String address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Zepto");
		

		
		while (true) {
			System.out.println("Enter the emp name :");
			if (sc.hasNext()) {
				employeeName = sc.next();
				break;
			}

			else {
				System.out.println("Invalid Input ! Do try again");
				sc.next();
			}
		}
		System.out.println(employeeName);

		while (true) {
			System.out.println("Enter the emp id :");
			if (sc.hasNextInt()) {
				employeeId = sc.nextInt();
				break;
			}

			else {
				System.out.println("Invalid Input ! Do try again");
				sc.next();
			}
		}
		System.out.println(employeeId);

		while (true) {
			System.out.println("Enter the emp age :");
			if (sc.hasNextInt()) {
				age = sc.nextInt();
				break;
			}

			else {
				System.out.println("Invalid Input ! Do try again");
				sc.next();
			}
		}
		System.out.println(age);

		while (true) {
			System.out.println("Enter the salary :");
			if (sc.hasNextInt()) {
				salary = sc.nextInt();
				break;
			}

			else {
				System.out.println("Invalid Input ! Do try again");
				sc.next();
			}
		}
		System.out.println(salary);

		while (true) {
			System.out.println("Enter the address :");
			address = sc.nextLine();
			if (!address.trim().isEmpty()) {
				//address = sc.nextLine();
				break;
			}

			else {
				System.out.println("Invalid Input ! Do try again");
				//sc.next();
			}
		}
		System.out.println(address);
		//
		System.out.println("The details of the Employee :"+ employeeName + " / " + employeeId + " / "+ age + " / "+ salary + " / " + address  );
		sc.close();

	}

}
