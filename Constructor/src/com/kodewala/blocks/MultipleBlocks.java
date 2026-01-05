package com.kodewala.blocks;

public class MultipleBlocks {
	static {
		System.out.println("SIB 1");

	}

	static {
		System.out.println("SIB 2");

	}
	// 2times sib

	{
		System.out.println("IIB 1");
	}

	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
	 MultipleBlocks (){
		 //either super or this . super()
		 //call to iib
		 System.out.println("Inside constructor");
		 // this.id = _id;
	 }
	// execution is from top to bottom
	// 2 times 3 blocks for each object the iib blocks
	 //iib bloc will always execute before the object creation 
	 // static block -> main ()->iib block -> constructor
	 // if mutiple sib and iib the it will be from top to bottom 
	 // one object is present and 3 iib is there the all 3 will be printed sequentially
	 // 2 object are there then 1st 3 iib in sequentially then for the second object

	public static void main(String[] args) {
		System.out.println("Main method");

		MultipleBlocks mb = new MultipleBlocks();
		//MultipleBlocks mb1 = new MultipleBlocks();

	}

}
