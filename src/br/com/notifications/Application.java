package br.com.notifications;

import br.com.notifications.controller.NotificationController;
import br.com.notifications.definitions.EmailNotificationFactory;
import br.com.notifications.definitions.Notification;
import br.com.notifications.definitions.SMSNotificationFactory;
import br.com.notifications.interfaces.NotificationSystem;
import br.com.notifications.interfaces.impl.EmailNotificationStrategy;
import br.com.notifications.interfaces.impl.SMSAdapter;
import br.com.notifications.interfaces.impl.User;
import br.com.notifications.model.NotificationModel;
import br.com.notifications.service.NotificationContext;
import br.com.notifications.service.NotificationManager;
import br.com.notifications.service.NotificationService;
import br.com.notifications.service.SMSNotification;
import br.com.notifications.view.NotificationView;

public class Application {
	public static void main(String[] args) {
		
		// Singleton
        NotificationManager manager = NotificationManager.getInstancia();
        manager.notifyUser("Sistema de Notificação Modelo Design Patteners iniciado.... (Singleton)");

        // Factory Method - Enviando Email
        EmailNotificationFactory emailFactory = new EmailNotificationFactory();
        Notification notification = emailFactory.createNotification();
        notification.sendNotification("Enviando Mensagem de E-mail utilizando o (Factory Method)");
        
        // Factory Method - Enviando SMS
        SMSNotificationFactory smsFactory = new SMSNotificationFactory();
        notification = smsFactory.createNotification();
        notification.sendNotification("Enviando Mensagem de SMS utilizando o (Factory Method)");

        // Adapter
        NotificationSystem smsSystem = new SMSAdapter(new SMSNotification());
        smsSystem.send("Mensagem via SMS utilizando o padrão (Adapter)");

        // Observer
        NotificationService service = new NotificationService();
        User user1 = new User("João");
        User user2 = new User("Maria");
        service.addObserver(user1);
        service.addObserver(user2);
        service.notifyObservers("Nova notificação para todos! (Observer)");

        // Strategy
        NotificationContext context = new NotificationContext(new EmailNotificationStrategy());
        context.executeStrategy("Mensagem enviada por E-mail utilizando o padrão (Strategy)");

        // MVC
        NotificationModel model = new NotificationModel("Modelo de notificação (MVC)");
        NotificationView view = new NotificationView();
        NotificationController controller = new NotificationController(model, view);
        controller.notifyUser();
	}
}
