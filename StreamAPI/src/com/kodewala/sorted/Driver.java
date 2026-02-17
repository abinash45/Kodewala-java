package com.kodewala.sorted;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,4,3,4,1);
		List<Integer> res = nums.stream().sorted().toList();
		System.out.println(res);
	}

}
