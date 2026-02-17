package com.kodewala.distinct;

import java.util.Arrays;
import java.util.List;

public class RemovwDuplicateWords {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash", "Rohit", "Peeyush", "abinash","Abinash");
		List<String> res = names.stream().distinct().toList();
		//List<String>result = names.stream.map(n->n.toLowercase()).distinct().toList();
		List<String> result = names.stream().map(n -> n.toLowerCase()).distinct().toList();

		System.out.println(result);
		System.out.println(res);
		
		//distinct use equals() to check so technically abinash != Abinash 
	}

}
