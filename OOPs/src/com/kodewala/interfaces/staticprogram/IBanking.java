package com.kodewala.interfaces.staticprogram;

public interface IBanking {
	public static final int max = 100;

	void doFundTransfer();

	public static void printPassBook(String bankName, String logo) {
		System.out.println("Printing passbook for " + bankName);
	}

	void printDetails();

	public static void userDetails(String userName, int age) {
		System.out.println("User name is : " + "" + userName + " age is :" + age);
	}
	public static void printCkBook (String bankName , String logo) {
		System.out.println("printing"+bankName);
		connectToprinter();
	}
	private static void connectToprinter () {
		System.out.println("Connecting with the printer ");
	}
}
