package com.kodewala.assiggnment;

import java.util.*;

public class DivisibleCheckWithMethod {
	
	public static boolean isDivisible (int num) {
		return num % 3 == 0 && num % 5 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		if (isDivisible (num) ) {
			System.out.println(num + " is divisible by both 3 and 5");
			
		} else {
			System.out.println(num + " is not divisble by both 3 and 5");
		}
		sc.close();

	}

}
