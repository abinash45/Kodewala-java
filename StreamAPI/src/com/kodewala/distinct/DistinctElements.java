package com.kodewala.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 4, 6, 8, 1, 2, 3, 5, 2, 4);
		 long count =  nums.stream().distinct().count();
		//int count = nums.stream().distinct().count();
		System.out.println(count);
	}

}
