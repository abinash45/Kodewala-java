package com.kodewala.interfaces.examsystem;

class OfflineExam implements Exam {

    public void startExam() {
        System.out.println("Offline exam started");
    }

    public void endExam() {
        System.out.println("Offline exam ended");
    }
}