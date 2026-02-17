package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrpLengthByStrings {

	public static void main(String[] args) {

	/*	List<String> names = Arrays.asList("abc", "be", "efg", "hij", "klmn", "opqrs", "thsgss");
		Map<Integer, List<String>> res = names.stream().collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(res);
		// ==========================================

		// length >4
		Map<Integer, List<String>> result1 = names.stream().filter(w -> w.length() > 4)
				.collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(result1);
		// ===================================
		// find first non - repeating char

		String name = "sswwsii";
		Character ch = name.chars().mapToObj(c -> (char) c).filter(c -> name.indexOf(c) == name.lastIndexOf(c))
				.findFirst().get();
				//.orElse(null);
		
		System.out.println(ch);
		*/
		String name = "Gaurav" ;
		//List<Character> letter = name.stream().
		Stream<Character> letters = name.chars().mapToObj(c->(char)c);
letters.forEach(c->System.out.println(c));
	}

}
