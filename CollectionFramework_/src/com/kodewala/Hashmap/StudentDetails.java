package com.kodewala.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentDetails {

	public static void main(String[] args) {
		Map<String, Integer> sc = new HashMap<String, Integer>();
		sc.put("Abinash", 01);
		sc.put("Rohit", 45);
		sc.put("Oscar Piastri", 81);
		for (Map.Entry<String, Integer> entry : sc.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
	}

}
