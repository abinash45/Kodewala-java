package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;

public class GetTop3Salaries {

	public static void main(String[] args) {
		List<Integer>salary = Arrays.asList(23000,34000,45000,1230,98900);
		salary.stream()
		//.filter
		.limit(3)
		.toList();
	}

}

// find the salary of top 3 