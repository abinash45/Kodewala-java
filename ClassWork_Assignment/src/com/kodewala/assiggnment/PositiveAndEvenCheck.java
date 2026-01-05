package com.kodewala.assiggnment;

import java.util.*;

public class PositiveAndEvenCheck {
	static int num;
	 //int num;

	public boolean positiveAndEven() {
		return num > 0 && num % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Checking for the number :");
		//int num = sc.nextInt();
		System.out.println("Enter the number :" );
		//int num = sc.nextInt();
		int num = sc.nextInt();
		PositiveAndEvenCheck pe = new PositiveAndEvenCheck();
		//System.out.println(pe.positiveAndEven());
		if (pe.positiveAndEven()) {
            System.out.println(num + " is positive AND even.");
        } else {
            System.out.println(num + " is NOT positive and even.");
        }
	}

}
