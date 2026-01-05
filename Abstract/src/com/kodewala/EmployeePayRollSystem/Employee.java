package com.kodewala.EmployeePayRollSystem;
abstract class Employee {
	String name;
	int id;


Employee (String name , int id){
	this.id=id;
	this.name=name;
}
abstract double calculateSalary();

final void displayDetails() {
	System.out.println("Employee name :"+name);
	System.out.println("Employee id:"+id);
}
}