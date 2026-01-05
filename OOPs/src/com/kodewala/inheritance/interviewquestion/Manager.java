package com.kodewala.inheritance.interviewquestion;

public class Manager extends Employee {
 private double bonus = 2000.00;
 public Manager (String name , double baseSalary) {
	 super (name , baseSalary);
 }
 public double calculateSalary () {
	 return getBaseSalary()  + bonus ;
 }
 public void showManagerDetails () {
	 showDetails();
	 System.out.println("Bonus :"+ bonus);
	 System.out.println("Total Salary (manager) :"+calculateSalary());
 }
}
