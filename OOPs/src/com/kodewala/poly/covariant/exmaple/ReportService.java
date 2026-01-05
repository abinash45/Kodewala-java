package com.kodewala.poly.covariant.exmaple;
//This class contains a method that returns the parent return type
	//Parent return type => (MedicalReport)
public class ReportService {
	
	/*
	 * Method name = generateReport
	 * return type = MedicalReport (parent type)
	 * This method can return any type of MedicalReport
	 * 
	 */
	public MedicalReport generateReport () {
		System.out.println("General report service");
		return new MedicalReport ();
	}

}
// These classes OVERRIDE the parent method.
// The return type is CHILD class ( covariant return type)
class BloodReportService extends ReportService {
	 // BloodReportService IS-A ReportService
	/*
	 * Overriding the parent method
	 * 
	 * Parent method return type : MedicalReport
	 * Child method return type : BloodReport
	 * BloodReport extends MedicalReport
	 * 
	 */
	@Override 
	public BloodReport generateReport () {
		System.out.println("Blood report service");
		return new BloodReport ();
	}
}

class XRayReportService extends ReportService {
	// XRayReportService  IS-A ReportService
	
	/*
	 *Parent method retun type :- MedicalReport 
	 * Child method return type : XrayReport
	 * XrayReport extends MedicalReport
	 * 
	 * 
	 * 
	 */
	
	@Override
	public XrayReport generateReport () {
		System.out.println("X- Ray report service");
		return new XrayReport ();
	}
}
