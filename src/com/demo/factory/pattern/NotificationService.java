package com.demo.factory.pattern;

public class NotificationService {

	 public static NotificationInterface createNotification(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Notification type cannot be null");
        }
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PUSHNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
