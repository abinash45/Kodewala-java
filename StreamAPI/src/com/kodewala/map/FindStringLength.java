package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash", "Oscar", "Peeyush");
		List<Integer> result = names.stream().map(n->n.length()).collect(Collectors.toList());
		//List<Integer> result = names.stream().map(n -> n.length()).collect(Collectors.toList());
       
	}

}
