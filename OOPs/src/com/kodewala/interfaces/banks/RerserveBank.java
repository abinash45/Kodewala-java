package com.kodewala.interfaces.banks;

public class RerserveBank implements Hdfc,Idfc,IndianBank,Kotak,Sbi{

	@Override
	public void sbiBranchDetails(String name) {
		System.out.println("The Barnch Name is :"+name);
		
	}

	@Override
	public void kotakBranchDetails(String name) {
		System.out.println("The Barnch Name is :"+name);
		
	}

	@Override
	public void BaranchDetails(String name) {
		System.out.println("The Barnch Name is :"+name);
		
	}

	@Override
	public void idfcdetails(String name) {
		System.out.println("The Barnch Name is :"+name);
		
	}

	@Override
	public void hdfcDetails(String name) {
		System.out.println("The Barnch Name is :"+name);
		
	}
	

}
