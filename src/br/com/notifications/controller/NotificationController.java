package br.com.notifications.controller;

import br.com.notifications.model.NotificationModel;
import br.com.notifications.view.NotificationView;

public class NotificationController {

	private NotificationModel model;
	private NotificationView view;

	public NotificationController(NotificationModel model, NotificationView view) {
		this.model = model;
		this.view = view;
	}

	public void notifyUser() {
		view.displayMessage(model.getMessage());
	}

}
