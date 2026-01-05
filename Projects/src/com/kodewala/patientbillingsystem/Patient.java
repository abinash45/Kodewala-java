package com.kodewala.patientbillingsystem;

public class Patient {
    private double baseBill;

    public Patient(double baseBill) {
        this.baseBill = baseBill;
    }

    public double getBaseBill() {
        return baseBill;
    }

    public double calculateBill() {
        return baseBill;
    }
}
