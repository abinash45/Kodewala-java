package com.kodewala.interfaces.loosecoupling;

class SMSNotification implements NotificationService {

    public void sendNotification() {
        System.out.println("SMS notification sent");
    }
}