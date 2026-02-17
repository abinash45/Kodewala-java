package com.practice;

import java.util.Objects;

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person o = (Person) obj;//
		return id == o.id && name.equals(o.name);

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "Abhi");
		Person p2 = new Person(1, "Abhi");
		Person p3 = new Person(1, "Abhi");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		//
	//	"abhi".equals("hi");

	}

}
