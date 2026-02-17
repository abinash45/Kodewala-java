package com.kodewala.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DistinctStringLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash", "Ram", "Rohit", "Rahul");
		List<Integer> res = names.stream().map(n -> n.length()).distinct().toList();
		System.out.println(res);

		List<Map.Entry<String, Integer>> result = names.stream()
		        .map(n -> Map.entry(n, n.length()))
		        .distinct()
		        .toList();
System.out.println(result);
	}

}
