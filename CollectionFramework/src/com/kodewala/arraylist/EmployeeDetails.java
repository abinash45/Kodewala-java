package com.kodewala.arraylist;

import java.util.ArrayList;

public class EmployeeDetails {

    public static void main(String[] args) {
        EmployeeNames en = new EmployeeNames();

        ArrayList<String> enames = en.getNamesOfEmp();

        for (String emp : enames) {
        	
            if (emp.startsWith("RA")) {  
                System.out.println(emp);
            }
        }
    }
}
