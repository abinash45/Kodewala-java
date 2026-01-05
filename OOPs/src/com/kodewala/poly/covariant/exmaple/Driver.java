package com.kodewala.poly.covariant.exmaple;
//This is where runtime polymorphism and covariant return type work together.
public class Driver {

	public static void main(String[] args) {
		//Parent reference child object enables run time poly
       ReportService service = new BloodReportService ();
       /*Here the reference type is ReportService and the object is BloodReportService.
         service is a parent class reference (ReportService).
          The actual object is BloodReportService (child class).
          This is runtime polymorphism, which is required for covariant return type to show its effect. Even though reference type is parent, the method of the child will run. 
        */
       //Call Overridden Method
       MedicalReport report = service.generateReport();
       //ReturnType variable = reference.methodName();
       
       //call the parent method 
       report.generate();
       //variable.methodName();
       
       //Downcast to Access child method
       //ChildType childVariable = (ChildType) parentVariable;
       BloodReport br =(BloodReport) report;
    // childVariable.childMethod();
       br.bloodDetails();
       
       System.out.println("-----------------");
       
       //Switch Parent Reference to Another Child
       //ParentType reference = new AnotherChildType();
       service = new XRayReportService ();
       
       //Call Overridden Method Again
       //ReturnType variable = reference.methodName();
       MedicalReport report2 = service.generateReport();
       report2.generate();
       
       XrayReport xr = (XrayReport) report2;
       xr.xrayDetails ();
	}

}
