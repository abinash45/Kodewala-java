package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {
	public static void main (String args[]) {
	List<Integer> num = Arrays.asList(2,3,4,5,1,2,3,5,7,8,9);
	 //num.stream().filter(n-> if (n == n)).
	Set<Integer> unique = new HashSet<>();
	List<Integer> result = num.stream ().filter(n-> !unique.add(n)).toList();
	System.out.println(result);
     
	
	
}
}
