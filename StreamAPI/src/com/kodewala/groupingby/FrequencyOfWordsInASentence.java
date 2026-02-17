package com.kodewala.groupingby;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfWordsInASentence {

	public static void main(String[] args) {
		String sentence = " Rohit Gurunath Sharma is the greatest Captain .";
    Map <String , Long> freq = Arrays.stream(sentence.split(" "))
    		.collect(Collectors.groupingBy(w-> w ,Collectors.counting()));
	}

}
