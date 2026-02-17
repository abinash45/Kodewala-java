package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

		List<String> res = numbers.stream()
		                          .map(n -> String.valueOf(n))
		                          .toList();

		System.out.println(res);

	}

}
