package com.kodewala.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountHowManyStringsForEachLength {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("Abinash", "Rohit", "Oscar");

		Map<Integer, Long> lengthCount = name.stream()
				.collect(Collectors.groupingBy(s -> s.length(), Collectors.counting()));

		Map<String, Integer> nameLength =
			    name.stream()
			        .collect(Collectors.toMap(
			            s -> s,
			            s -> s.length()
			        ));
		nameLength.forEach((n,l) -> System.out.println(n+ "->"+l));

	}

}
