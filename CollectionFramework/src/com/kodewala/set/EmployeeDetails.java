package com.kodewala.set;
import java.util.HashSet;
import java.util.Set;

class Employee {
	String name ;
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
		return  5499090;
	}
}
public class EmployeeDetails {
	public static void main (String args []) {
	Set <Employee>em = new HashSet <>(64);	
   Employee e1 = new Employee ("Abinash1");
   Employee e2 = new Employee ("Abinash2");
   Employee e3 = new Employee ("Abinash3");
   Employee e4 = new Employee ("Abinash4");
   Employee e5 = new Employee ("Abinash5");
   Employee e6 = new Employee ("Abinash6");
   Employee e7 = new Employee ("Abinash7");
   Employee e8 = new Employee ("Abinash8");
   Employee e9 = new Employee ("Abinash9");
   
  em.add(e1);
  em.add(e2);
  em.add(e3);
  em.add(e4);
  em.add(e5);
  em.add(e6); 
  
  em.add(e7);
  em.add(e8);
  em.add(e9);
  System.out.println(e2.hashCode());
  System.out.println(em);
}
}