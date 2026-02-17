package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindTheLowest {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 3, 8, 90, 1, 0, 456);
		int res =num.stream().sorted().findFirst().get();
	 System.out.println(res);
	 int result= num.stream().sorted().skip(1).findFirst().get();
	System.out.println(result);
	int res1 =num.stream().sorted().skip(2).findFirst().get();
	System.out.println(res1);
	}

}
