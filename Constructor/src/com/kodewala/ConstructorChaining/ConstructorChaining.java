package com.kodewala.ConstructorChaining;

public class ConstructorChaining {
	
	int id;
	String name;
	double amount;
	
	
	ConstructorChaining(){
		this (12,"Abinash",0.18);
		// by seeing the this key word  is will move to the second constructor and there 
		//i called printDetails(); so it is printing the value .
		printDetails ();
	}
	

	ConstructorChaining(int id , String name , double amount){
		this.amount=amount;
		this.id=id;
		this.name= name;
		
		printDetails ();
	}
 void printDetails () {
	 System.out.println("Id of user is : " + id + ", name of user is :" + name +" , amount is : " + amount );
 }
	

	public static void main(String[] args) {
		
		ConstructorChaining cc2 = new ConstructorChaining ();
		
		ConstructorChaining cc = new ConstructorChaining (23,"Rohit",0.45);
		ConstructorChaining cc1 = new ConstructorChaining (29,"Rahul",0.47);
		
		

	}

}
