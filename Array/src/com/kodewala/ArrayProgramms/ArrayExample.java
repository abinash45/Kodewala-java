package com.kodewala.ArrayProgramms;

import java.util.Scanner;
public class ArrayExample {

	// user input for an integer array
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter size of array :");
		 int n = sc.nextInt ();		 
		 int [] arr = new int [n];
		 System.out.println("Enter " + n + " numbers: ");
		 for (int i = 0; i <n; i++) {
			 arr [i] = sc.nextInt ();
			// System.out.println("The numbers are :"+i);
		 }
		 for(int i = 0; i<n; i++) {
		 System.out.println("The numbers are :"+arr[n]);
	}
		// System.out.println("The numbers are :"+arr[i]);

	}
}
