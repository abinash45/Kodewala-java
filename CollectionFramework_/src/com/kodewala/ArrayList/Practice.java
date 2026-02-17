package com.kodewala.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String>list=new ArrayList<String>();
		list.add("bbsr");
		list.add("smvt");
		list.add("btm");
		
		for(String i:list) {
			System.out.println(i);
			list.remove(1);
		}*/
		
		
		/*ConcurrentHashMap<Integer, String>ch=new ConcurrentHashMap<Integer, String>();
		ch.put(1, "abhi");
		ch.put(2, null);
		System.out.println(ch);*/
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(131);
		list.add(121);
		list.add(1);
		
		
		
		
		Collections.unmodifiableList(list);
		System.out.println(list);
		

	}

}
