package com.kodewala.inheritance.interviewquestion;

public class Driver {

    public static void main(String[] args) {

        Employee e1 = new Manager("Abinash", 80000.00);
        Employee e2 = new Developer("Rohit", 98000.00);

        System.out.println("---- Manager ----");
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();

        System.out.println("---- Developer ----");
        System.out.println("Salary: ₹" + e2.calculateSalary());
    }
}
