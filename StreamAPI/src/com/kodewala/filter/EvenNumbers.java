package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		//Given a List<Integer>, use filter() to collect only even numbers.
		List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9);
		List<Integer >reseult = num.stream().filter(n-> n%2 ==0).collect(Collectors.toList());
System.out.println(num);}
}
