package br.com.notifications.definitions;

import br.com.notifications.service.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory{

	@Override
	public Notification createNotification() {
		// TODO Auto-generated method stub
		return new SMSNotification();
	}

}
