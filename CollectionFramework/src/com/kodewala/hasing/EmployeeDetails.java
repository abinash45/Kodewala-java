package com.kodewala.hasing;

import java.util.HashSet;

class Employee {
	String  name;

	public Employee(String name) {
		
		this.name = name;
	}
	
	@Override
	public boolean equals (Object obj) {
		Employee e2 = (Employee) obj;
		return this.name.equals(e2.name);
	}
	
	@Override
	 public int hashCode() {
		return this.name.hashCode();
	}
	
}
public class EmployeeDetails {

	public static void main(String[] args) {
		
		HashSet <Employee>emp = new HashSet <>();
		
	   Employee e1 = new Employee ("Abinash");// This is not belong to String class 
	   Employee e2 = new Employee ("Abinash");
	   System.out.println(e1.equals(e2));
	   System.out.println(e1.hashCode());
	   System.out.println(e2.hashCode());
	  emp.add(e1);
	  emp.add(e2);
	  //set.contains()
	  
	  //   System.out.println(e1.equals(e2)); It gives false , also the hash codes are different here .
	  // After overriding it gives true , still the hash codes are not same 
	  
	}

}
