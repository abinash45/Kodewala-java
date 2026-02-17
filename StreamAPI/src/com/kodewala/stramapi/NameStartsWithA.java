package com.kodewala.stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameStartsWithA {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Abinash");
		words.add("Rohit");
		words.add("Rahul");
		words.add("Abhisek");
		words.add("Peeyush");
		words.add("Virat");
		
		List<String> res = new ArrayList <String>();
		for(String word : words) {
			if(word.startsWith("A")) {
				res.add(word);
			}
		}
		System.out.println(res);
		//Converting the collection to stream
		Stream<String> stream = words.stream();
		
		//filter (intermediate operation) the word starts with "A"
		Stream<String> filteredStream = stream.filter(w->w.startsWith("A"));
		
		// converting it to uppercase
		Stream<String> upperCaseStream = filteredStream.map(w->w.toUpperCase());
		
		//collecting the data (Its a terminal operation)
		List<String> result1 = upperCaseStream.collect(Collectors.toList());
		
		System.out.println(result1);
		List<String> result2 = res.stream().filter(w->w.startsWith("A")).map(w->w.toUpperCase()).collect(Collectors.toList());
		System.out.println(result2);
	}

}
