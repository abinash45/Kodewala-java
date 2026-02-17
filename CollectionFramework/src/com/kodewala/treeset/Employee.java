package com.kodewala.treeset;

import java.util.TreeSet;

class EmployeeDetails {
String name;
	
	public EmployeeDetails (String name) {
		this.name = name;
	}
	
	public class Employee {
	public static void main(String[] args) {
		TreeSet <EmployeeDetails> ts = new TreeSet <EmployeeDetails> ();
		
		EmployeeDetails ed1 = new EmployeeDetails ("Abinash");
		EmployeeDetails ed2 = new EmployeeDetails ("Peeyush");
		EmployeeDetails ed3 = new EmployeeDetails ("Supriyo");
		EmployeeDetails ed4 = new EmployeeDetails ("Rohit");
		EmployeeDetails ed5 = new EmployeeDetails ("Virat");
		
		ts.add(ed1);
		ts.add(ed2);
		ts.add(ed3);
		ts.add(ed4);
		ts.add(ed5);
		
		
	}

}
	}
