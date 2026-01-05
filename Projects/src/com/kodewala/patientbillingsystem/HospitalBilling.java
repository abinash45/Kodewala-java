package com.kodewala.patientbillingsystem;

public class HospitalBilling {
	private double consultationFees = 500;
	
	
	
	double calculateBill () {
		return consultationFees;
	}
	
	double calculateBill (double labCharges) {
		return consultationFees + labCharges;
	}
	
	
	double calculateBill (double labCharges, double roomCharges) {
return consultationFees + labCharges +roomCharges;
}
}
