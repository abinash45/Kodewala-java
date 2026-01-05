package com.kodewala.exceptions;

public class EmployeeRecordCheck {

	public static void main(String[] args) {
		try {
			String [] employees = {"Abinash", "Rohit","Ritika"};
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Employee record not found");
		}

	}

}
