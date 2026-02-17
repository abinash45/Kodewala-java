package com.kodewala.stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NamesStartWithR {

	public static void main(String[] args) {
		List<String> words = new ArrayList <String> ();
            words.add("Abinash");
            words.add("Rohit");
            words.add("Rahul");
            words.add("Abhisek");
            words.add("Peeysh");
            words.add("Virat");
            words.add("Surya");
            
            List<String> result = words.stream()
            		.filter(w->w.startsWith("R"))
            		.map(w-> w.toUpperCase())
            		.toList();
          

            System.out.println(result);
            
	}

}
