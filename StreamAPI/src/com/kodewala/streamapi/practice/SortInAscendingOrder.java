package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class SortInAscendingOrder {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 9, 56, 78, 90, 543);
		List<Integer> res = num.stream().sorted((a, b) -> a - b).toList();
        System.out.println(res);
	
	}

}
