package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;

public class NameStartsWithA {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("Abinash","Peeyush");
		List <String> results =  names.stream().filter(n-> n.startsWith("A")).toList();
		System.out.println(results);

	}

}
