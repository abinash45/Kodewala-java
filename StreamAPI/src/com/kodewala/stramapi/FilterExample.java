package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		/*List<String> names = Arrays.asList("Abinash","Peeyush","Rohit","Abhisek");
		List<String> result1= names.stream().filter(name ->name.startsWith("A")).collect(Collectors.toList());
		 System.out.println(names);
		 List<String> result2= names.stream().filter(name -> name.length()>3).collect(Collectors.toList());
		 System.out.println(result2);
		 List<String> result3= names.stream().filter(name -> name.length()>5).map(name -> name.toUpperCase()).collect(Collectors.toList());
		 System.out.println(result3);
		 */
		// multiply then find greater 
		List<Integer> num = Arrays.asList(2 ,1,3, 4, 8, 10);
		List<Integer> result =num.stream().map(n -> n*5).filter(n->n>5).collect(Collectors.toList());
		System.out.println(result);
	}

}
