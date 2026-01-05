package com.kodewala.ConstructorChaining;

public class Employee {
	
	String name;
	
	Employee (String name)
	{
		this.name = name;
	System.out.println("Name of the employee is :"+ name);
	
	}
}
class Manager extends Employee {
	
	String department ;
	
	Manager (String name , String department){
		super(name);
		this.department= department;
		System.out.println(name + " is a manager of " + department);
		
	}
	public static void main(String[] args) {
		
		Manager m = new Manager ("Abinash", "IT");

	}

}
