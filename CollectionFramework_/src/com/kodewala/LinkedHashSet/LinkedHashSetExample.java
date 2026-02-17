package com.kodewala.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet <String>lhe = new LinkedHashSet <>();
          lhe.add("Laptop");
          lhe.add("SmartPhone");
          lhe.add("Tablet");
          lhe.add("SmartWatch");
          lhe.add("Earphone");
          for(String item : lhe) {
        	  System.out.println(item);
          }
          System.out.println("Does the set contain 'Laptop' "+ lhe.contains("Laptop"));
          lhe.remove("SmartWatch");
          for(String item : lhe) {
        	  System.out.println(item);
          }
	}

}
