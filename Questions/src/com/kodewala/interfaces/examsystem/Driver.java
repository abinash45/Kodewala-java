package com.kodewala.interfaces.examsystem;

public class Driver {

	public static void main(String[] args) {
		Exam onlineExam = new OnlineExam();
        onlineExam.startExam();
        onlineExam.endExam();

        Exam offlineExam = new OfflineExam();
        offlineExam.startExam();
        offlineExam.endExam();

	}

}
