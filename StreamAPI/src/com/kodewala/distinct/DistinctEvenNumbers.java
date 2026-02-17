package com.kodewala.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctEvenNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 4, 6, 4, 8, 9, 1, 3);
		List<Integer> res =num.stream().filter(n -> n % 2 == 0).distinct().toList();

	}

}
