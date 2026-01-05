package com.kodewala.ArrayProgramms;

import java.util.*;

public class ZeptoEmployeeDetails {
	String name;
	int accountNo;
	String email;
	double balance;

	ZeptoEmployeeDetails(String name, int accountNo, String email, double balance) {
		this.name = name;
		this.accountNo = accountNo;
		this.email = email;
		this.balance = balance;
	}

	void display() {
		System.out.println("Name       : " + name);
		System.out.println("Account No : " + accountNo);
		System.out.println("Email      : " + email);
		System.out.println("Balance    : " + balance);
	}

	void messageAlert() {
		System.out.println("your account balance is in negative");
	}

	boolean negativeBalance() {
		return balance < 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employees :");
		int n = sc.nextInt();
		sc.nextLine();

		String[] names = new String[n];
		int[] accNo = new int[n];
		String[] emails = new String[n];
		double[] balance = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the deatils" + (i + 1));

			System.out.println("Name :");
			names[i] = sc.nextLine();

			System.out.println("Account No :");
			accNo[i] = sc.nextInt();
			sc.nextLine();

			System.out.println("Email :");
			emails[i] = sc.nextLine();

			System.out.println("Balance :");
			balance[i] = sc.nextInt();
			sc.nextLine();

		}
		for (int i = 0; i < n; i++) {
			ZeptoEmployeeDetails ze = new ZeptoEmployeeDetails(names[i], accNo[i], emails[i], balance[i]);
			if (ze.negativeBalance()) {
				System.out.println("--------");
				ze.display();
				ze.messageAlert();
			}
		}
		sc.close();
	}

}
