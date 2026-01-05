package com.kodewala.ArrayProgramms;
import java.util.*;

public class EmployeeSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String [] employees = new String [4];
		
		employees[0]="Rohit";
		employees[1]="Virat";
		employees[2]="Rahul";
		employees[3]="Iyer";
		
		System.out.println("Enter Employee Name to search");
		String searchName = sc.nextLine();
		boolean found = false;
		
		for(int i = 0; i<employees.length;i++) {
			if (employees[i].equalsIgnoreCase(searchName)) {
				System.out.println("Employee Found: "+ employees[i]);
				found = true;
				break;
				
			}
		}
		if(!found) {
			System.out.println("Employee with name " + searchName + " not found");
		}
		sc.close();
	}

}
