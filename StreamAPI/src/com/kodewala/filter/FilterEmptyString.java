package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;

public class FilterEmptyString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("" , "Abinash" , "" ,"Peeyush");
		List<String> nonEmpty = names.stream().filter(s->!s.isEmpty()).toList();
		System.out.println(names);
	}

}
