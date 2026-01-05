package com.kodewala.poly.covariant.exmaple;

//This is the general class that the parent method will return.
// All specific reports will extend this class.
public class MedicalReport {
//Common behavior for all medical reports
	public void generate () {
		System.out.println("Generating medical report");
	}
}
//These are moreSpecific types of medical reports 
class BloodReport extends MedicalReport {
	public void bloodDetails () {
		System.out.println("Blood test details");
	}
}

class XrayReport extends MedicalReport {
	public void xrayDetails () {
		System.out.println("X- ray scan details");
	}
}