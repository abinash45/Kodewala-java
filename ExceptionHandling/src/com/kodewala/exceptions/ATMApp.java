package com.kodewala.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ATMApp {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter withdrawl amount");
			int amount = sc.nextInt();
			int check = 1000 / amount;
			System.out.println("Transaction successful");
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("Invalid input! Please enter a valid amount greater than zero.");
		}

	}
}