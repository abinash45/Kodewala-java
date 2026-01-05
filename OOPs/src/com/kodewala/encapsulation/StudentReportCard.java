package com.kodewala.encapsulation;

 class Student {
	 private int marks;
	 String name;
	 private String studentId;
	 String address;
	 private String bloodGroup;
	 
	 Student (int marks , String name , String studentId , String address , String bloodGroup){
		 this.marks = marks;
		 this.name= name;
		 this.studentId=studentId;
		 this.address = address;
		 this.bloodGroup= bloodGroup;
		 
	 }
	 
	 public int getMarks() {
		 return marks;
	 }
	 public void setMarks(int marks) {
		 this.marks = marks;
	 }
	 public String getStudentId() {
		 return studentId;
	 }
	 public void setStudentId(String studentId) {
		 this.studentId = studentId;
	 }
	 public String getBloodGroup() {
		 return bloodGroup;
	 }
	 public void setBloodGroup(String bloodGroup) {
		 this.bloodGroup = bloodGroup;
	 }
	 
	 public void studentMark () {
		 if (marks > 30 && marks < 50 ) {
			 System.out.println("Student passed with C Grade ");
		 }
		 else if ( marks >= 50 && marks < 70) {
			 System.out.println("Student passed with B Grade ");
		 }
		 else if (marks >= 70 && marks <=100) {
			 System.out.println ("Student passed with A grade ");
			 
		 }
		 else if (marks < 30 && marks >=0){
			 if (marks <= 10) {
				 marks = marks +15;
				 System.out.println("Student secured"+marks+"and cleared the supplimentary test");
			 }
			 else if (marks <= 20) {
				 marks = marks + 10;
				 System.out.println("Student secured"+marks+"and cleared the supplimentary test");
			 }
			 else {
				 System.out.println("Do not put the negative marks");
			 }
			 
		 }
		 else {
			 System.out.println ("You have entered invalid marks please put marks between 1  to 100");
		 }
	 }
	 public void displayDetails () {
		 System.out.println("------ Student Details ------");
		    System.out.println("Name: " + name);
		    System.out.println("Student ID: " + studentId);
		    System.out.println("Address: " + address);
		    System.out.println("Blood Group: " + bloodGroup);
		    System.out.println("Marks: " + marks);
		}
	
}
public class StudentReportCard {

	public static void main(String[] args) {
		Student s = new Student (67,"Abinash Nayak","AB2141","Bhubaneswar","B+ve");
		//s.studentMark();
		System.out.println("Printing the student details");
		s.studentMark();
		s.displayDetails ();

	}

}
