package com.kodewala.arraylist;

import java.util.LinkedList;

public class CitiesOfIndia {

	public static void main(String[] args) {
		
		LinkedList <String> city = new LinkedList <String>();
		
		city.add("BLR");
		
		city.add("HYD");
		
		city.add("MUM");
		
		city.add("AHM");

		city.add("DEL");

		city.add("BBSR");

		System.out.println(" Cities Of India : " + city);
		
		city.add(2,"PUN");
		
		System.out.println(" Cities Of India : " + city);

	}

}
