package com.kodewala.blocks;

public class InitBlocks {
	static {
		// runs only once per class loading
		// executing before main () after the class load
		// common attribute for all the objects like (database connections, file
		// connections , some initialization)
		System.out.println("Init block1"); // it will be printed first

	}

// this is instance block runs before every constructor
	// IIB

	{
		System.out.println("inside IIB");
	}
	static {
		System.out.println("Init block2");
	}

	InitBlocks() {
		// constructor run for every object
		// 1st line super();
		// second line call to init block
		// 3rd line our own logic
		System.out.println("Init Blocks inside constructors");
	}

	public static void main(String args[]) {
		System.out.println("InitBlocks.main()"); // 2nd
		InitBlocks ib1 = new InitBlocks();
		InitBlocks ib2 = new InitBlocks();
		InitBlocks ib3 = new InitBlocks();
	}

}
/*
 * OutPut ----------- Initblocks InitBlocks.main() inside IIB Init Blocks inside
 * constructors inside IIB Init Blocks inside constructors inside
 * IIBInitBlocks.main() Init Blocks inside constructors
 * 
 */

//SIB :- Static Initialisation Block

//IIB :- Instance Initialisation Block

/*
 * When a class loads, Static Initialization Block (SIB) runs. { Initblocks}
 * main() starts {InitBlocks.main()} Creating the first object → new
 * InitBlocks() IIB runs {inside IIB} Constructor runs{Init Blocks inside
 * constructors} Creating second object {inside IIB} Second object → constructor
 * {Init Blocks inside constructors} SIB will NOT run again. Third object
 * {inside IIB} Third object constructor {Init Blocks inside constructors}
 * 
 */


/*Class file will be loaded into memory in the area called meta space and generally it is called method area.
 * Static block will be called (SIB will be called)
 * Main method.
 * 
 * 
 * 
 * 
 * 
 * 
 */
