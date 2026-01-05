package com.kodewala.dynamicmethoddispatch;


class Notification{
	void send () {
		System.out.println("Sending generic notification");
	}
}

class EmailNotification extends Notification {
	void send() {
		System.out.println("Sending email");
	}
}

class SmsNotification extends Notification{
	void send() {
		System.out.println("Sending sms notification");
	}
}

class PushNotification extends Notification {
	void send () {
		System.out.println("Sending push notification");
	}
}

public class Driver {

	public static void main(String[] args) {
		
		
		Notification notification;
		notification = new EmailNotification ();
		notification.send();
		
		notification = new SmsNotification ();
		notification.send();
		
		notification = new PushNotification ();
		notification.send();
	}

}
