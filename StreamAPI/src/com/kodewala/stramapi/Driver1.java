package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class Driver1 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(22, 3, 4, 5, 89);
		List<Integer> res =num.stream().filter(n -> n > 20).map(n -> n + 10).toList();
		System.out.println(res);
	}

}
