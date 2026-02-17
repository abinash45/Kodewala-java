package com.kodewala.stramapi;

import java.util.ArrayList;
import java.util.List;

public class CountNamesStartingWithA {

	public static void main(String[] args) {
	List<String> words = new ArrayList <>();
	
	words.add("Abinash");
	words.add("Rohit");
	words.add("Rahul");
	words.add("Peeyush");
	words.add("Virat");
	words.add("Abinash");
	
	
	
	words.add("Abinash");
	words.add("Abinash");
	
	long count = words.stream().filter(w->w.startsWith("A")).count();
	System.out.println(count);
	}

}
