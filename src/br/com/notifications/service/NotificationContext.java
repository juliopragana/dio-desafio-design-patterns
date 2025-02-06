package br.com.notifications.service;

import br.com.notifications.interfaces.NotificationStrategy;

//Strategy
public class NotificationContext {
	private NotificationStrategy strategy;

	public NotificationContext(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(String message) {
		strategy.send(message);
	}
}
