package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class FindLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash","Rohit","Peeyush","Oscar");
		List <Integer> res =names.stream()
		.map(n->n.length())
		.toList();
		System.out.println(names);
		System.out.println(res);
		
	}

}
