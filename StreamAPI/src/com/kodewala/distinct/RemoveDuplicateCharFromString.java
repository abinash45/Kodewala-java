package com.kodewala.distinct;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Abinash");
		//List<Character> result = name.stream().distinct().toList();
		List<Character> result = ((CharSequence) name).chars()
		        .mapToObj(c -> (char) c)
		        .distinct()
		        .toList();

		
	System.out.println();
	}

}


//remove duplicate char from a string