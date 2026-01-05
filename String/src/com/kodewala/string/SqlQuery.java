package com.kodewala.string;

public class SqlQuery {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder ("SELECT * FROM employees WHERE 1=1");
		boolean filterByDepartment = true ;
		if (filterByDepartment) {
			sb.append("AND department = 'IT'");
		}
		boolean filterBySalary = true ;
		if(filterBySalary) {
			sb.append("AND salary > 5000");
		}
		System.out.println(sb.toString());

	}
	
	

}
