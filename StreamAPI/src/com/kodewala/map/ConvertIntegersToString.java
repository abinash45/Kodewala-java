package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntegersToString {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Abinas","Oscar","Rohit");
		strings.stream().map(String :: valueOf)
		.collect(Collectors.toList());
		System.out.println(strings);
	}

}
