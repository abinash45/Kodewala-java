package com.kodewala.assiggnment;

public class StudentDetails {
	static String schoolName = "SSVM";
	
	String name = "Abinash Nayak";
	int rollNo = 2141014071;
	int marks = 480;

	public static void main(String[] args) {
		
		StudentDetails sd = new StudentDetails ();
		StudentDetails sd1 = new StudentDetails ();
		StudentDetails sd2 = new StudentDetails ();
		
		System.out.println("===== Details of a school =====");
		System.out.println(schoolName);
		System.out.println(sd.name);
		System.out.println(sd1.rollNo);
		System.out.println(sd2.marks);

	}

}
