package br.com.notifications.interfaces.impl;

import br.com.notifications.interfaces.NotificationSystem;
import br.com.notifications.service.SMSNotification;

//Classe que implementa o Adpter (Interface) NotificationSystem - Para o envio da mensagem do tipo SMS
public class SMSAdapter implements NotificationSystem {
	
	private SMSNotification smsNotification;

    public SMSAdapter(SMSNotification smsNotification) {
        this.smsNotification = smsNotification;
    }
    
    @Override
    public void send(String message) {
        smsNotification.sendNotification(message);
    }
}
