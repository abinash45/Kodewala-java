package com.kodewala.constructorsuper;

public class StateBank extends Rbi{
   StateBank (){
	   super ("Minimum Balance = 200");
	   System.out.println("StateBank: Default Constructor");
   }
   
   StateBank (String name) {
	   this ();
	   System.out.println("StateBank: Branch Name - " +name);
   }
   public static void main (String args []) {
	   System.out.println("Creating  First Object");
	   StateBank sb1 = new StateBank ();
	   
	   System.out.println("Creating the second object");
	   StateBank sb2 = new StateBank ("Bhubaneswar Location");
   }
}
