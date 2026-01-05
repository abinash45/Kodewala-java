package com.kodewala.interfaces.examsystem;

class OnlineExam implements Exam {

    public void startExam() {
        System.out.println("Online exam started");
    }

    public void endExam() {
        System.out.println("Online exam ended");
    }
}