package com.kodewala.interfaces.loosecoupling;

class NotificationApp {
    public static void main(String[] args) {

        NotificationService service = new EmailNotification();
        service.sendNotification();
    }
}