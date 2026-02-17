package com.kodewala.ArrayList;
import java.util.ArrayList;
public class ArraylistExample3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("mango");
		// get(index)
		System.out.println("Elem" + "" + "ent at index 1:" + list.get(1));
		// set(index, value)
		System.out.println(list.set(3, "grapes"));
		// remove(index)
		System.out.println(list.remove(1));
		// contains()
		System.out.println("Contains Apple ?" + list.contains("Apple"));
		// indexOf()
		System.out.println("Index of Mango" + list.indexOf("Mango"));

	}

}
