package br.com.notifications.service;

import br.com.notifications.definitions.Notification;

public class EmailNotification extends Notification {

	@Override
	public void sendNotification(String message) {
		System.out.println("Enviando email: " + message);
	}

}
