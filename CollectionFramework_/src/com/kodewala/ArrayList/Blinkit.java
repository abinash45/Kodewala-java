package com.kodewala.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Blinkit {

	public static void main(String[] args) {
		Set<String> items = new HashSet<String>();
		items.add("Perfume");
		items.add("mobile");
		items.add("paste");
		Set<String> ums = Collections.unmodifiableSet(items);
		System.out.println("Initial set" +  ums);
		items.add("watch");
		System.out.println("After adding " + items);
		
		//ums.add("cake");
	    //System.out.println(ums);
		
	}

}
