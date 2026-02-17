package com.kodewala.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class WordStartWithA {

	public static void main(String[] args) {
		List<String> al = new ArrayList <String>();
		al.add("Abinash");
		al.add("Rohit");
		al.add("Rahul");
		al.add("Peeyush");
		al.add("Abhisek");
		
		for (String names: al ) {
			if(names.startsWith("A")) {
				System.out.println(names);
			}
		}
	}

}
