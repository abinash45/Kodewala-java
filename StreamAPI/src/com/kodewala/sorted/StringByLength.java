package com.kodewala.sorted;

import java.util.Arrays;
import java.util.List;

public class StringByLength {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("Abinah","Rohit","Oscar");
       List<String> res= names.stream().sorted((s1,s2)->s1.length() - s2.length()).toList();
       System.out.println(res);
	}

}
  


/*
 *  s1.length() - s2.length()  = -ve that means s1 will come first then s1 same it is viceversa in +ve
 *  if length is 0 that means same length() 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








