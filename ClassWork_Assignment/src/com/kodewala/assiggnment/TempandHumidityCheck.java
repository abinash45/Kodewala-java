package com.kodewala.assiggnment;
import java.util.*;

// Given a range of temp (from command line arguments identify whether the temperature is both above 30 degree c and humidity below 50%
public class TempandHumidityCheck {
	
	public static boolean check (int temp , int humidity) {
		return temp > 30 && humidity < 50 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of days to check :");
		int days = sc.nextInt();
		
		for (int i = 1; i<= days ; i++) {
			System.out.println ("\nDay"+i);
			
			System.out.println("Enter temperature (°C):");
			int temp = sc.nextInt();
			
			System.out.println("Enter humidity (°C)");
			int humidity = sc.nextInt();
			
			if(check(temp , humidity)) {
				System.out.println("Condition matched");
				
			}
			
			else {
				System.out.println("Condition does not match");
			}
		}
		
		sc.close();

	}

}
