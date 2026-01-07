package com.kodewala.exceptions;

public class Driver4 {

	public static void main(String[] args) {
		Driver4 driver = new Driver4 ();
		driver.doSomething();

	}
	public void doNothing () throws Exception { // here we can add multiple exception 
		try {
			String name = null;
			int length = name.length();
		}catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("name can not be null");
			throw new Exception ("Internal error");
		}
	}
	public void doSomething () {
		System.out.println("Do something");
		try {
			doNothing();
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Calling the doNothing method");
			e.printStackTrace();
		}
	}

}
