package com.kodewala.blocks;

public class ObjectCount {
	  static int count = 0;
	   
	{
		count ++;//common activity required for all the object creation 
		System.out.println(count);// it will just print in each time 
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		ObjectCount oc = new ObjectCount ();
		ObjectCount oc1 = new ObjectCount ();
		ObjectCount oc2 = new ObjectCount ();
		ObjectCount oc3 = new ObjectCount ();
		System.out.println("The number of objects are :" +count);
	}

}
