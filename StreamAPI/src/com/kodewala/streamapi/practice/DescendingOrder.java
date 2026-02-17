package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class DescendingOrder {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 3, 4, 5, 90, 34, 78, 79, 999);
		List<Integer> res = num.stream().sorted((a, b) -> b - a).toList();
		System.out.println(res);

	}

}
