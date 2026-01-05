package com.kodewala.patientbillingsystem;

 class VIPPatient extends Patient {

    public VIPPatient(double baseBill) {
        super(baseBill);
    }

    @Override
    public double calculateBill() {
        return getBaseBill() + 2000;
    }
}
