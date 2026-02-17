package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;

public class First2NumGreaterthan20 {

	public static void main(String[] args) {
		 List<Integer> nums = Arrays.asList(20,30,40,50);
     List<Integer> result = nums.stream().filter(n->n>20).limit(2).toList();
     System.out.println(result);
	}

}
