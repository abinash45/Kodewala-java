package com.kodewala.interfaces.loosecoupling;

class EmailNotification implements NotificationService {

    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}