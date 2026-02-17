package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "I", "am", "from", "BLR");
		
		List<String> result = words.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());

		System.out.println(result);

		List<Integer> length = words.stream().map(w -> w.length()).collect(Collectors.toList());
		System.out.println(length);
		
		List <Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> result1 = words.stream()
		        .map(w -> Integer.parseInt(w) * 5)
		        .collect(Collectors.toList());
		

	}
}