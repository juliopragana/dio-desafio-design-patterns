package br.com.notifications.interfaces.impl;

import br.com.notifications.interfaces.NotificationSystem;
import br.com.notifications.service.EmailNotification;


//Classe que implementa o Adpter (Interface) NotificationSystem - Para o envio da mensagem do tipo E-mail
public class EmailAdapter implements NotificationSystem {
	
	private EmailNotification emailNotification;

    public EmailAdapter(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

	@Override
	public void send(String message) {
		emailNotification.sendNotification(message);		
	}

}
