package com.kodewala.encapsulation;

class Employee {
	
	private double basicSalary ;
	private double bonus ;
	private double deductions;
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		if(basicSalary > 0) {
		this.basicSalary = basicSalary;
	} else {
		System.out.println("Invalid Basic Salary !");
	}
	}
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if(bonus >=0) {
		this.bonus = bonus;
	}else {
		System.out.println("Inavlid Bonus Amount !");
	}
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		if(deductions >=0) {
		this.deductions = deductions;
		} else {
			System.out.println("Invalid Deduction Amount");
		}
	}
	public double calculateNetSalary () {
		return basicSalary + bonus - deductions;
	}

	
public  Employee(double basicSalary , double bonus ,double deductions) {
	this.basicSalary=basicSalary;
	this.bonus=bonus; 
	this.deductions=deductions;
}

}


public class EmployeeSalary {

	public static void main(String[] args) {
		
		Employee emp = new Employee(30000,5000,2000);
		emp.setBonus(4500);
		emp.setDeductions(2500);
		 System.out.println("Basic salary:" + emp.getBasicSalary());
		 System.out.println("Bonus:" + emp.getBonus());
		 System.out.println("Deductions:" + emp.getDeductions());
		 System.out.println("Basic salary:" + emp.calculateNetSalary());
		 

	}

}
