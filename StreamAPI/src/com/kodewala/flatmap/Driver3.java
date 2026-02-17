package com.kodewala.flatmap;

import java.util.List;

public class Driver3 {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3);
		List<Integer> res = nums.stream().flatMap(n -> List.of(n, n * 10).stream()).toList();
		System.out.println(res);
	}

}
