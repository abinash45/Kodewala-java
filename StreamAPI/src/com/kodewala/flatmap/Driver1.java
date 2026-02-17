package com.kodewala.flatmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		List<List<Integer>> data = List.of(List.of(1,2,3),List.of(3,4),List.of(5,6),List.of(7,8));
		List<Integer> result = data.stream()
				.flatMap(l->l.stream())
				.toList();
		System.out.println(data);
		
		
		List<Integer>r=data.stream().flatMap(i->i.stream()).map(i->i).collect(Collectors.toList()).reversed();
		System.out.println(r);
		
		
		
		
		List<Integer>re=data.stream().flatMap(i->i.stream()).toList();
			System.out.println(result);

		System.out.println(re);

	}

}
