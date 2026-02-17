package com.kodewala.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3ElementsFromAList {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,3,4,5);
 List<Integer> top3 = nums.stream()
		 .distinct()
		 .sorted(Comparator.reverseOrder())
		 .limit(3)
		 .toList();
 System.out.println(top3);
	}

}
