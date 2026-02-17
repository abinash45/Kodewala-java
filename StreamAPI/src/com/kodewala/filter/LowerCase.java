package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;

public class LowerCase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash","Rohit","Peeyush","OScar");
		List <String> res=names.stream()
		.map(n-> n.toLowerCase())
		.toList();
		System.out.println(res);
	}

}
