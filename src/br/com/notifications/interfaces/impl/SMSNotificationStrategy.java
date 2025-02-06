package br.com.notifications.interfaces.impl;

import br.com.notifications.interfaces.NotificationStrategy;

public class SMSNotificationStrategy implements NotificationStrategy {

	@Override
	public void send(String message) {
		 System.out.println("SMS: " + message);
	}

}
