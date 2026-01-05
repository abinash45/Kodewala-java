package com.kodewala.ConstructorChaining;

public class Student {

	// String name;
	String emailId;
	String courseName;
	int amount;

	Student() {

	}

	Student(String emailId) {
		this.emailId = emailId;
		System.out.println("This is a Registred user :" + emailId);

	}

	Student(String emailId, String courseName) {
		this.emailId = emailId;
		this.courseName = courseName;
		System.out.println("This is a Enrolled tudent  ." + "The mail id is :" + emailId + "and the course name is :"
				+ courseName);

	}

	Student(String emailId, String courseName, int amount) {
		this.emailId = emailId;
		this.courseName = courseName;
		this.amount = amount;
		System.out.println("This is paid Student  ." + "The mail id is :" + emailId + "and the course name is :"
				+ courseName + "The amount is :" + amount);

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("abinash45@gmail.com");
		Student s3 = new Student("nabinash9247@gmail.com", "CSE");
		Student s4 = new Student("abinash899@gmail.com", "CSIT", 20000);

	}

}
// second line of constructor is (in it) block
