package com.kodewala.EmployeePayRollSystem;

public class PartTimeEmployee extends Employee{
 PartTimeEmployee(String name, int id,int hoursWorked,double hourlyWage) {
		super(name, id);
		this.hourlyWage=hourlyWage;
		this.hoursWorked=hoursWorked;
		
	}
 private int hoursWorked;
 private double hourlyWage;
 @Override
 double calculateSalary() {
	
	return hoursWorked * hourlyWage;
 }
 
}
