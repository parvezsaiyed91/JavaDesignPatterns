package com.demo.factory.pattern;

public class Caller {

	public static void main(String[] args) {

		 NotificationInterface notification = NotificationService.createNotification("EMAIL");
	     notification.sendNotification("parvezsaiyed91@gmail.com");
	     
	     NotificationInterface notificationSMS = NotificationService.createNotification("SMS");
	     notificationSMS.sendNotification("Your SMS message here");
	     
	     NotificationInterface notificationPUSH = NotificationService.createNotification("PUSH");
	     notificationPUSH.sendNotification("Your PUSH message here");
	}

}
