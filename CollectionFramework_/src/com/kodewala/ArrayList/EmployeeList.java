package com.kodewala.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("BLR");
		list.add("CH");
		list.add("HYD");

	/*	Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			System.out.println(element);
			list.add("Dl");
		}
		System.out.println(list);
	*/
	List<String> syncList = Collections.synchronizedList(list);

	
	ConcurrentHashMap<String, String> map = new ConcurrentHashMap <String , String>();
	map.put("KA" , "BLR");
	map.put("TS", "HYD");
	Map<String , String> syncMap = Collections.synchronizedMap(map);
	}
}
