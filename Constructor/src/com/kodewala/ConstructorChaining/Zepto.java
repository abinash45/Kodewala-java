package com.kodewala.ConstructorChaining;

public class Zepto {
	 String companyName ;
	 
	 Zepto (String companyName){
		 this.companyName=companyName;
		 
	 }
		public static void main(String[] args) {
			Zepto z = new Zepto ("Zepto");
			Employe emp = new Employe ("Amazon", "Abinash", 104);
			
			emp.showDetails ();

		}
	 
}


class Employe extends Zepto {
	
	String empName;
	int empId;
	
	Employe (String companyName, String empName, int empId){
		super(companyName);
		this.empName = empName;
		this.empId = empId;
	}
	
	void showDetails () {
		System.out.println("Comapny Name:" + companyName);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee id:" + empId);
		
	}


}
