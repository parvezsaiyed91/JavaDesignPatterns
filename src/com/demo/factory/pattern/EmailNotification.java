package com.demo.factory.pattern;

public class EmailNotification implements NotificationInterface{

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending EMAIL: " + message);
	}
}
