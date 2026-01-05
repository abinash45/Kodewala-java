

package com.kodewala.classwork;

public class ZeptoEmployee {
  static String companyName = "Zepto";
   String employeeName = "Abinash Nayak";
   int empId = 2345;
   
   int salary = 234567;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ZeptoEmployee ze = new ZeptoEmployee();
		System.out.println("Company name is :"+companyName);
		System.out.println("Employee name is :"+ze.employeeName);
		System.out.println("Employee id is :"+ze.empId);
		System.out.println("Employee salary is :"+ze.salary);
	}

}
