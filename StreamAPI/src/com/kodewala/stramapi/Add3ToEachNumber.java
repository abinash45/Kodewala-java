package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class Add3ToEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2, 4, 5, 6);
		List<Integer> res =nums.stream().map(n -> n + 3).toList();
		System.out.println(res);
	}

}
