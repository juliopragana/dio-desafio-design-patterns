package br.com.notifications.definitions;

//Factory Method para a definição do tipo de notificação

//Classe abastrata que envia a notificação de acordo com o seu tipo

public abstract class Notification {
	 public abstract void sendNotification(String message);
}
