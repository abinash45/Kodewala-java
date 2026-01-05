package com.kodewala.gfg;

public class AverageNumbersArray {

	static double average(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return (double) sum / n;

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6 };
		int n = arr.length;
		System.out.println(average(arr, n));
	}

}
/*
 Find the average of an array 
 In method we are passing the array with the size of the array
 our array is an integer array but when we will calculate the avg we will getting the answer in double 

so our return statement is like this 
return (double) sum / n;

it is an iterative way 







*/