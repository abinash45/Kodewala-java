package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class FindTheHighestNumber {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(3, 45, 56, 44, 90, 98, 76);
		int res = num.stream().sorted((a,b)-> b-a).findFirst().get();
		System.out.println(num);
		System.out.println(res);
	}

}
