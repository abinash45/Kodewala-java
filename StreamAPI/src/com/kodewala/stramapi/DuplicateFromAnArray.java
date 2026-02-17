package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFromAnArray {

	public static void main(String[] args) {
		List<List<Integer>> nums = Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(3,4,5,6),Arrays.asList(7,8,9));
         Set<Integer> inp = new HashSet<Integer>();
        List<Integer> output= nums.stream().flatMap(num->num.stream().filter(n-> !inp.add(n))).toList();
        System.out.println(output);
	}

}
