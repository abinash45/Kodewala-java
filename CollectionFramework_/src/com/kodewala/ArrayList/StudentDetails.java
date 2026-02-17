package com.kodewala.ArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentDetails {

	public static void main(String[] args) {
		//ArrayList<String> al = new ArrayList<String>();
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
		
		al.add("Abinash");
		al.add("Peeyush");
		al.add("Brajesh");
		al.add("Supriyo");
		al.add("Abhisek");
		
		for(String elements:al) {
			System.out.println(elements);
		//al.remove(3);
		//System.out.println(al);
			//al.remove(3); // array index out of bound error
		//al.remove("Peeyush"); no error
		//al.add("Rohit");
			al.remove(0);
		}
	}

}
