package com.kodewala.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {

	public static void main(String[] args) {
		List<String>list= Arrays.asList("Java","SpringBoot","API","Cloud");
Map<Integer , List<String>>result = list.stream().collect(Collectors.groupingBy(s->s.length()));
System.out.println(result);
	}

}
