package com.kodewala.Threads;

class PrintEvenNumber implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("The even number is " + i + " - " 
                        + Thread.currentThread().getName() + " Thread");
            }
        }
    }
}

class Helper extends Thread {

    @Override
    public void run() {
        PrintEvenNumber obj = new PrintEvenNumber();
        System.out.println("Hello");
    }
}

public class Driver2 {

    public static void main(String[] args) {

        Helper t1 = new Helper();
        t1.setName("First");
        t1.start();

        Helper t2 = new Helper();
        t2.setName("Second");
        t2.start();
    }
}