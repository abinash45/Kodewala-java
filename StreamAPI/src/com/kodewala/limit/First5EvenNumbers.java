package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;

public class First5EvenNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9,10,1,2,5,6);
		List<Integer> res =num.stream()  
		.filter(n-> n%2 ==0)
         .distinct()
         .limit(5)
         .toList();
		
		System.out.println(res);
	}

}
// find the first 5 distinct even numbers
