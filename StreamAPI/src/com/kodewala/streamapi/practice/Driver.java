package com.kodewala.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
       // printing each char from the string 
		String name = "Abinash";
		Stream<Character> letters = name.chars().mapToObj(c -> (char) c);
		letters.forEach(c -> System.out.println(c));

		// frequency of each char
		
		Map<Character , Long> ch =  name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(ch);
		
		// Sort the string by length 
		
		List<String> names = Arrays.asList("Abinash","Rohit","aaaaaa","Peeysh","a","aa");
		List<String>res =names.stream().sorted((a,b)->a.length()- b.length()).toList();
		System.out.println(res);
		
		//longest string from the string 
		String res1 = names .stream().sorted((a,b)->b.length()- a.length()).findFirst().get();
				System.out.println(res1);
	}

}

