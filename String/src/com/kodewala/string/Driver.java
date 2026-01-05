package com.kodewala.string;
class Person {
	String name;
	
	public Person (String _name) {
		this.name = _name;
	}
}

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person ("Abinash");
		
		
		Person p2 = new Person ("Abinash");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		
	}

}
