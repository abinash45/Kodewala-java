package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class StringContainAtoUppercase {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("Abinash","Rohit","Oscar","ab","bbb");
		List<String>res =names.stream()
		.filter(n->n.contains("a"))
		.map(n->n.toUpperCase())
		.toList();
		
System.out.println(res);
	}

}
