package com.kodewala.hasing;

import java.util.HashSet;

class Student {
	 String name;
	 public Student (String name) {
		 this.name = name;
	 }
	 
	 
	 @Override
	 public boolean equals(Object obj) {
		 //return false;
		 Student s2 = (Student) obj;
		// Student s2 = new (Student)obj;
		 return this.name.equals(s2.name);
	 }
	 
	 @Override
	 public int hashCode() {
		 return this.name.hashCode();
	 }
 }
public class StudentDetails {

	public static void main(String[] args) {
		HashSet <Student> s = new HashSet <Student>();
		Student s1 = new Student ("Abinash");
		Student s2 = new Student ("Abinash");
		s.add(s1);
		s.add(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
	}

}
