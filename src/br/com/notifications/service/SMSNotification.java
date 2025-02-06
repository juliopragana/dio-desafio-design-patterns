package br.com.notifications.service;

import br.com.notifications.definitions.Notification;

public class SMSNotification extends Notification {

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Enviando SMS" + message);
	}

}
