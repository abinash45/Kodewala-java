package com.kodewala.stramapi;

import java.util.Arrays;
import java.util.List;

public class Lenghmorethan5andUppercase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abinash", "Rohit", "Oscar");
		List<String> res=names.stream().filter(w -> w.length() > 5).map(w -> w.toUpperCase()).toList();

	}

}
