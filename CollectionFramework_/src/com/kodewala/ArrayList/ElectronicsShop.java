package com.kodewala.ArrayList;

import java.util.ArrayList;

public class ElectronicsShop {

	public static void main(String[] args) {
		ArrayList<String> shop = new ArrayList<String>();
		shop.add("TV");
		shop.add("Laptop");
		shop.add("Watches");
		System.out.println(shop.get(2));
		System.out.println(shop);
		System.out.println(shop.remove(0));
		System.out.println(shop);
		System.out.println(shop.size());
		System.out.println("------------------------------------");
		ArrayList<Integer> pid = new ArrayList<Integer>();
		pid.add(001);
		pid.add(002);
		pid.add(003);
		System.out.println(pid.get(2));
		System.out.println(pid);
		System.out.println(pid.remove(0));
		System.out.println(pid);
		System.out.println(pid.size());

		
		System.out.println("The proudct is " + shop.get(0) + " and the product id is " + pid.get(0));
	}

}
