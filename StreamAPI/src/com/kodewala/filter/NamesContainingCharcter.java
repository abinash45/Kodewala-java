package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesContainingCharcter {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("Abinash","Peeyush","ROHIT");
		List<String> result = names.stream()
                .filter(n -> n.toLowerCase()
                .contains("a"))
                .collect(Collectors.toList());

    		 System.out.println(result);
	}


}

