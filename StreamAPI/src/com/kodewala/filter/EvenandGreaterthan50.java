package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenandGreaterthan50 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,4,5,6,7);
		List<Integer> res =	numbers.stream().filter(n->n%2 ==0 && n>5).collect(Collectors.toList());
		System.out.println(res);	
	}

}
