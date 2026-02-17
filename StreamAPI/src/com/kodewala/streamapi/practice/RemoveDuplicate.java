package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 3, 4, 4, 1, 2, 3, 6, 7, 66, 66, 78, 234);
		List<Integer> Result = num.stream().distinct().toList();
	System.out.println(Result);
	}

}
