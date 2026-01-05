package com.kodewala.interviewquestions.question20;

public class Employee  implements workable,SecurityAccess{

	@Override
	public void accessOffice() {
		System.out.println("Employee is working on office tasks");
		
	}

	@Override
	public void work() {
		
		System.out.println("employee accessed office using ID card");
	}
	

}
