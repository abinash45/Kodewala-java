package com.kodewala.inheritance.interviewquestion;

public class Developer extends Employee{
	
	private double skillAllowance = 15000;
	public Developer (String name , double baseSalary) {
		super (name , baseSalary);
	}
	public double calculateSalary () {
		return getBaseSalary() + skillAllowance ;
	}
	public void showDeveloperDetails () {
		showDetails();
		System.out.println("Skill Allowance:"+skillAllowance);
		System.out.println("Total Salary"+calculateSalary());
	}

}
