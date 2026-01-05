package com.kodewala.functionalintefaces;

@FunctionalInterface
interface OddOrEven {
    void findOddOrEven(int n);
}

public class Driver4 {

    public static void main(String[] args) {

        OddOrEven oe = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        oe.findOddOrEven(10); // ✅ correct
    }
}
