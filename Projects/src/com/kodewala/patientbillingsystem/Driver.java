package com.kodewala.patientbillingsystem;

public class Driver {

    public static void main(String[] args) {

        Patient p1 = new Patient(5000);
        Patient p2 = new InsurancePatient(5000);
        Patient p3 = new VIPPatient(5000);

        System.out.println("Normal Patient Bill: ₹" + p1.calculateBill());
        System.out.println("Insurance Patient Bill: ₹" + p2.calculateBill());
        System.out.println("VIP Patient Bill: ₹" + p3.calculateBill());
    }
}
