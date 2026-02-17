package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> num = Arrays.asList(1,2,3,4,5);
  
  List<Integer> res = 
		  num.stream()
		  .limit(3)
		  .toList();
  
  System.out.println(res);
  
  
  
  
  
	}

}
