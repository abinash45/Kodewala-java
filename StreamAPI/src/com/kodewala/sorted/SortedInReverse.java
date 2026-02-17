package com.kodewala.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedInReverse {

	public static void main(String[] args) {
		
		List<String> nums = Arrays.asList("Abinash","Peeyush","Oscar");
		List<String> sortedDesc = nums.stream().sorted(Comparator.reverseOrder()).toList();
		
    System.out.println(sortedDesc);
    
    
    
    
	}

}
