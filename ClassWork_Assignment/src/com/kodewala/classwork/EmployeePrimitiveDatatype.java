package com.kodewala.classwork;

public class EmployeePrimitiveDatatype {

	public static void main(String[] args) {

		// String employeeName = "Abinash Nayak"; String is non-primitive
		int employeeId = 2141014071;
		byte employeeAge = 21;
		long employeePhoneNumber = 0000000000;
		float salary = 980000.0f;
		char grade = 'A';
		boolean salaryCheck = true;

		System.out.println("----Employee Details ----");
		System.out.println(employeeId);
		System.out.println(employeeAge);
		System.out.println(salary);
		System.out.println(grade);
		System.out.println(employeePhoneNumber);
		System.out.println(" Permission for the salary check");
		if (salaryCheck) {
			System.out.println("Salary of employee is :" + salary);
		} else {
			System.out.println("Not granted ");
		}

	}

}
