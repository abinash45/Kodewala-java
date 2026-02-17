package com.kodewala.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CityAndCapital {

	public static void main(String[] args) {
		Map <String , String > statesAndCapital = new HashMap <String , String>();
		statesAndCapital.put("Odisha", "Bhubaneswar");
		statesAndCapital.put("Maharastra", "Mumbai");
		statesAndCapital.put("Tamilnadu", "Chennai");
		statesAndCapital.put("KA", "BLR");
		statesAndCapital.put("Odisha", "Cuttack");
		statesAndCapital.put(null , "Abinash");

		System.out.println(statesAndCapital);
			}

}
