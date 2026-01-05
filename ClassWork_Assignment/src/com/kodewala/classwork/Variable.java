package com.kodewala.classwork;

public class Variable {
	
	static String companyCode = "IA4500";
	String name = "Abinash Nayak";
	String deptName = "HR";
	int age = 12;
	
	public static void main(String args []) {
		Variable v = new Variable ();
		System.out.println("The Comapany code is :"+ Variable.companyCode);
		System.out.println("The Comapany name is :"+ v.name);
		System.out.println("The Comapany name is :"+ v.deptName);
		System.out.println("The Comapany name is :"+ v.age);
		
		
		
	}

}
