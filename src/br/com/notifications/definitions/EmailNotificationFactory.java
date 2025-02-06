package br.com.notifications.definitions;

import br.com.notifications.service.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory{

	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}

}
