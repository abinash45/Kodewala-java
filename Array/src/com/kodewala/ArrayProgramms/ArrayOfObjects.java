package com.kodewala.ArrayProgramms;


class student{
	String name;
	int age ;
	
	student(String name , int age){
		this.name=name; 
		this.age= age;
	}

}
public class ArrayOfObjects {


	public static void main(String[] args) {
		student [] students = new student [3];
		
		 students[0] = new student("Abinash", 20);
	        students[1] = new student("Riya", 22);
	        students[2] = new student("Karan", 19);
		
System.out.println("Student Details :");
for (int i = 0 ; i<students.length;i++) {
	System.out.println(students[i].name + " "+ students[i].age);
}
	}

}
