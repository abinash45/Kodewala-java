package com.kodewala.inheritance.interviewquestion;

public class Employee {
 private String name;
 private double baseSalary;
 public Employee (String name , double baseSalary) {
	 this.name=name;
	 this.baseSalary=baseSalary;
 }
 public String getName() {
	return name;
}

 public void setName(String name) {
	this.name = name;
 }

 public double getBaseSalary() {
	return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
 }
public double calculateSalary() {
	return baseSalary;
}
public void showDetails() {
	System.out.println("Name :"+name);
	System.out.println("Base Salary:"+baseSalary);
}
 
}
