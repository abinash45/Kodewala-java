package com.kodewala.methodoverloading;

class LoanIdentityDetails {
	LoanIdentityDetails(String userName , String password, double loanAmount){
		System.out.println("The user name is "+userName+"Password of user is "+ "the amount he is applying for is "+loanAmount);
	}
	LoanIdentityDetails(String AadharName ,int userId, String panNumber, double loanAmount){
		System.out.println("The user aadhar name is "+AadharName+" user id is "+userId+ "the amount he is applying for is "+loanAmount+ "and his pan number is "+panNumber);
	}
	LoanIdentityDetails(int aadharNumber , int pincode, double loanAmount,int userId){
		System.out.println("The user aadhar number  is "+aadharNumber+"Pincode of user is "+pincode+ "the amount he is applying for is "+loanAmount+"and user id is "+ userId );
	}
}

public class LoanDetails {

	public static void main(String[] args) {
		LoanDetails lid = new LoanDetails();
		//lid.LoanIdentityDetails("Abinash", "GH899", 250000);
		LoanIdentityDetails l1 =new LoanIdentityDetails("Abinash", "GH899", 250000);
		 LoanIdentityDetails l2 =new LoanIdentityDetails("Abhisek", 7899, "CQV2344", 300000);
	        LoanIdentityDetails l3 =	new LoanIdentityDetails(123456789, 560001, 450000, 97879);
	}

}
