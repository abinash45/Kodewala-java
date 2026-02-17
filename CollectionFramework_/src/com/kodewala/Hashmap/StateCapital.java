package com.kodewala.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class StateCapital {

	public static void main(String[] args) {
		
		Map<String, String> sc = new HashMap<>();
		sc.put("Mah", "Mum");
		sc.put("Kar", "Blr");
		sc.put("Tam", "Che");
		sc.put("Wb", "kol");
		
		for(Map.Entry<String,String>entry : sc.entrySet()) {
			 System.out.println("State: " + entry.getKey() + " Capital: " + entry.getValue());
		}
	}

}
