package com.kodewala.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet <String> products = new HashSet<String>();
		products.add("Laptop");
		products.add("Phones");
		products.add("Tablet");
		products.add("SmartPhone");
		products.add("HeadPhones");
		products.add(null);
		Iterator<String> itr = products.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

/*



What is an Iterator?

An Iterator is an object used to traverse (loop through) a collection one element at a time.

It is mainly used when:

You don’t know the index (like in HashSet)

You want a safe way to read or remove elements





*/