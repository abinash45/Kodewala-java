package com.kodewala.string;

public class StringInterning {

	public static void main(String[] args) {
		String s1 = "Abinash Nayak";
		String s2 = new String ("Abinash Nayak");
		System.out.println("1) Checking for s1==s2 "+(s1==s2));
		String s3 = s2.intern();
		System.out.println("2) Checking for s1==s2 "+(s1==s3));
		String s4 = new String ("Abinash Nayak").intern();
		System.out.println("3) Checking for s1==s4 "+(s1==s4
				));
		

	}
	// it will copy the object from heap to scp, if object is already available in scp then it will start pointing.
	

}


