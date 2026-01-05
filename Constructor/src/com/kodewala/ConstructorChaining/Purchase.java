package com.kodewala.ConstructorChaining;

public class Purchase {
	
	Purchase (String name){
	this("Abinash", 2000);
		System.out.println(name);
		//+this("Abinash", 2000);
		
	}
	
	Purchase (String name , int id){
	  //super ();
		System.out.println(name + id);
		
	}
	public static void main(String[] args) {
	
		Purchase p = new Purchase ("Abinash");
		Purchase p1 = new Purchase ("Peeyush", 20003);
		
		System.out.println(p.hashCode());
	}

}
