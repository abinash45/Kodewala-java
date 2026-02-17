package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;

public class LengthCheck {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash","Peeyush","Rohit");
		List<String> res =names.stream().filter(n->n.length()>5).toList();
		System.out.println(res);
	}

}
