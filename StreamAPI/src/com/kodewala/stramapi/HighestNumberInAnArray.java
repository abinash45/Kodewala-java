package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestNumberInAnArray {

	public static void main(String[] args) {
		/*
		 * List<Integer> num = Arrays.asList(2, 3, 4, 4, 5, 6, 6, 5, 77, 7, 89, 66);
		 * //2,3,4,5,6,66,77,89 List<Integer> n = num.stream().distinct().toList();
		 * List<Integer> sortedNum = n.stream().sorted((a, b) -> b - a).toList(); int
		 * highest = sortedNum.stream().skip(1).findFirst().get();
		 * 
		 * //get of optional class which get us the element
		 * System.out.println("Printing the highest"); System.out.println(highest);
		 * System.out.println("Printing the third lowest"); List<Integer> third =
		 * n.stream().sorted((a,b) -> b-a).toList(); int thirdHighest =
		 * third.stream().skip(2).findFirst().get(); System.out.println(thirdHighest);
		 * 
		 * //Lowest
		 * 
		 * System.out.println("   ===  Print the lowest ===="); List<Integer> newSorted
		 * = n.stream().sorted((a, b) -> a - b).toList(); int lowest =
		 * newSorted.stream().findFirst().get(); System.out.println(lowest);
		 * 
		 * System.out.println("Printing 2nd lowest"); List<Integer> secondLowest =
		 * n.stream().sorted((a, b) -> a - b).toList(); int res =
		 * secondLowest.stream().skip(2).findFirst().get(); System.out.println(res);
		 * 
		 */
		//
		List<String> names = Arrays.asList("Java", "Spring", "api", "upi", ".net", "cloud");

		Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(words -> words.length()));
		System.out.println(result);

		System.out.println("----------------------------------");
		System.out.println("Grp by words by length only if > 4");
		Map<Integer, List<String>> result1 = names.stream().filter(w -> w.length() > 4)
				.collect(Collectors.groupingBy(words -> words.length()));
		System.out.println(result1);

		System.out.println("------------------------------------------");
		System.out.println("Find the first non -repating char from a string");
		// List<String> name = Arrays.asList("ABINASH");
		// ABINASH
		// ABINSH

		// index of() - first index
		// lastIndexOf() - find the last index of the particular char
		String name = "sswwii";
		Character ch = name.chars().mapToObj(c -> (char) c).filter(c -> names.indexOf(c) == names.lastIndexOf(c))
				.findFirst().get();
		System.out.println(ch);
	}

}
