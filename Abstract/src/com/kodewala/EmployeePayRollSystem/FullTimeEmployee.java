package com.kodewala.EmployeePayRollSystem;

public class FullTimeEmployee extends Employee {
private double monthlySalary;
	FullTimeEmployee(String name, int id , double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

}
