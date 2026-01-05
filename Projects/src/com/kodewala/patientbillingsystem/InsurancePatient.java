package com.kodewala.patientbillingsystem;

public class InsurancePatient extends Patient {

    public InsurancePatient(double baseBill) {
        super(baseBill);
    }

    @Override
    public double calculateBill() {
        return getBaseBill() * 0.7;
    }
}

