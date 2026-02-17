package com.kodewala.Treeset;

import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		TreeSet <String> s = new TreeSet <>();
		s.add("laptop");
		s.add("Smartphone");
		s.add("tablet");
		s.add("laptop");
		s.add("laptop");
		
         System.out.println(s);
	}

}

