package com.kodewala.gfg;

public class CountOddAndEven2 {
static int [] countOddEven (int[]arr) {
	int evenCount = 0;
	int oddCount =0;
	for (int i=0; i<arr.length;i++) {
		if ((i & 1)!= 0) {
			//dry run this logic
			oddCount++;
		}
		else {
			evenCount++;
		}
	}
		return new int [] { oddCount , evenCount};
	
}
	public static void main(String[] args) {
		int [] arr = {2,3,4,5};
		int [] ans = countOddEven(arr);
		System.out.println(ans[0]+ " "+ans[1]);

	}

}
