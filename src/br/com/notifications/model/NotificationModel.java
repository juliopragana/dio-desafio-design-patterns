package br.com.notifications.model;

public class NotificationModel {
	private String message;
	
	public NotificationModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
