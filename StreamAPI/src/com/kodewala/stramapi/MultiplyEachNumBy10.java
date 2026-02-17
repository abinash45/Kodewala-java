package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class MultiplyEachNumBy10 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(3, 4, 5, 6);
		List<Integer> res = num.stream().map(n -> n * 10).toList();
		System.out.println(res);

	}

}
