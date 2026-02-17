package com.kodewala.map;

import java.util.Arrays;
import java.util.List;

public class Upeercase {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("Abinash", "Rohit","Peeyush","Oscar");
		List <String>res =names.stream().map(n->n.toUpperCase()).toList();
		System.out.println(res);
	}

}
