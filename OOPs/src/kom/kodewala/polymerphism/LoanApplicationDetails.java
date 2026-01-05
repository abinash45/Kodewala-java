package kom.kodewala.polymerphism;

 class LoanApplyDetails {
 public void userLoanApplication (String userName ,String password,double amount) {
	 System.out.println("Loan application is submitted for the user with name "+userName+"and his amoount is "+amount);
 }
 public void userLoanApplication (String AdharName,int userId ,String panNumber, double amount) {
	 System.out.println("Loan application is submitted for the useAdhar with name "+AdharName+"and his amoount is "+amount);
 }
 public void userLoanApplication (String AdharNumber ,int pincode,double amount, int userID) {
	 System.out.println("Loan application is submitted for the user with AdharNumber "+AdharNumber+"and his amoount is "+amount);
 }
}
 
 
 class LoanApplicationDetails {
	 public static void main (String args []) {
		 LoanApplyDetails la = new LoanApplyDetails (); 
		 la.userLoanApplication("Abinash","GH899",2344.00);
		 la.userLoanApplication("Abhisek",7899,"CQV2344",899.00);
		 la.userLoanApplication("AF90999",789899,2344.00, 97879);
		 
		//method call run time 
		 //decision take runtime
		 
	 }
}