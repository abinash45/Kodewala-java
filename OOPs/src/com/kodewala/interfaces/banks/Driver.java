package com.kodewala.interfaces.banks;

public class Driver {

	public static void main(String[] args) {
		RerserveBank rb = new RerserveBank ();
		//rb.BaranchDetails(Bhubaneswar);
		rb.hdfcDetails("Bhubaneswar");
		rb.BaranchDetails("Delhi");
		rb.kotakBranchDetails("Cuttack");
		rb.idfcdetails("Banglore");
		rb.sbiBranchDetails("Niali");
		
	}

}
