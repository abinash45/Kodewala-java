package com.kodewala.gfg;

public class DigitsInWords {
	static void printWord(String num) {
        String[] words = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = c - '0';   // Convert char → number
            System.out.print(words[digit] + " ");
        }
    }

    public static void main(String[] args) {
        String N = "123";
        printWord(N);
    }
}
/*



input :- n = 1234
output :- One Two Three Four
Every digit of the given number has been converted into its corresponding word.
We will using switch case like 0 to 9 10 options what if we print all the possible values and then as per user requirements we can print the values 



*/