package com.kodewala.classwork;

public class EmployeeDetails {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Printing the employee details");
			return;
		}

		String employeeId = args[0];
		String employeeName = args[1];
		String employeeSalary = args[2];
		String employeeAddress = args[3];

		System.out.println("=====Employee details=====");
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeSalary);
		System.out.println(employeeAddress);

		// opening command line in eclipse :- run as configuration then arguments

	}
}
