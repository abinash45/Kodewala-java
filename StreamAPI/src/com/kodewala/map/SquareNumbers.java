package com.kodewala.map;

import java.util.Arrays;
import java.util.List;

public class SquareNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,3,4,6,7);
		List<Integer> res=num.stream().map(n-> n * n).toList(); 
		System.out.println(res);
		
	}

}
