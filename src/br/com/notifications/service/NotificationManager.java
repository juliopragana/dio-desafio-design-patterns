package br.com.notifications.service;


//Singleton para o gerenciamento do envio de Notificações
public class NotificationManager {
	
	private static class Notification {
		public static NotificationManager instancia = new NotificationManager();
	}
	 
	private NotificationManager() {
		super();
	}
	
	public static NotificationManager getInstancia() {
		return Notification.instancia;
	}
	
	public void notifyUser(String message) {
		System.out.println("Enviando mensagem: " + message);
	}
	 
}
