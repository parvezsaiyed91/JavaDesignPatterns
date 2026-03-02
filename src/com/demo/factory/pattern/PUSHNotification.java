package com.demo.factory.pattern;

public class PUSHNotification implements NotificationInterface {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending PUSH notification: " + message);
	}
}
