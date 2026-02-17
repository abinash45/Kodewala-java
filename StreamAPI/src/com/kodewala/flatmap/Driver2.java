package com.kodewala.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		// List<List<Integer>> data =
		// List.of(List.of("Hello","I"),List.of("Am","From"),List.of("Bangalore"));
		List<List<String>> data = List.of(List.of("Hello", "I"), List.of("Am", "From"), List.of("Bangalore"));

		List<String> res = data.stream().flatMap(list -> list.stream()).toList();
		System.out.println(res);
		
		
		
		
		
	}
}


