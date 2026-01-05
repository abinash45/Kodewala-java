package com.kodewala.EmployeePayRollSystem;

public class PayrollSystem {

	public static void main(String[] args) {
	
		Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        emp1.displayDetails();
        System.out.println("Salary: ₹" + emp1.calculateSalary());

        System.out.println();

        Employee emp2 = new PartTimeEmployee("Bob", 102, 80, 500);
        emp2.displayDetails();
        System.out.println("Salary: ₹" + emp2.calculateSalary());

        System.out.println();
	}

}
