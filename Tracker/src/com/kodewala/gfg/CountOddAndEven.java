package com.kodewala.gfg;

public class CountOddAndEven {
	
static int [] countOddEven (int [] arr) {
	int oddCount =0;
	int evenCount =0;
	for (int i =0; i< arr.length; i++) {
		if (arr[i] % 2 ==0) {
			evenCount ++;
		}
		else {
			oddCount++;
		}
	}
	return new int [] { oddCount , evenCount};
	/* A method in java can return only one thing , but if we want to give back 
	 * 2 values we must pack them together inside one object.
	 * Easiest way to do this by doing in an array
	
	
	
	
	*/
}
	public static void main(String[] args) {
		int arr [] = {2,3,4,5};
		int ans [] = countOddEven(arr) ; //ans array
		System.out.println(ans[0]+ " ");
	}

}
 /*
input: arr= [2,3,4,5,6]
output: 2 3 
2 odds and 3 evens 
Here we have to count both odd and even and return both
so in input inside the method we need to pass an array 
also in output we will get 2 values in an array 





*/