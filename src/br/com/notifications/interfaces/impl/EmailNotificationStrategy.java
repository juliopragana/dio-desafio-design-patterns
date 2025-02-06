package br.com.notifications.interfaces.impl;

import br.com.notifications.interfaces.NotificationStrategy;

public class EmailNotificationStrategy implements NotificationStrategy{

	@Override
	public void send(String message) {
		System.out.println("E-mail: " + message);		
	}

}
