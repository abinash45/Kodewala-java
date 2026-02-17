package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;

public class PositiveNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,3,4,-5,6,7,-8);
	List<Integer> res=	num.stream().filter(n-> n>0).toList();
		System.out.println(res);
	}

}
