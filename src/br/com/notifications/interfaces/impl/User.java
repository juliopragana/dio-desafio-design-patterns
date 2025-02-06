package br.com.notifications.interfaces.impl;

import br.com.notifications.interfaces.Observer;

//ConcreteObserver
public class User implements Observer {
	
	private String name;

    public User(String name) {
        this.name = name;
    }

	@Override
	public void update(String message) {
		 System.out.println(name + " recebeu a notificação: " + message);
	}

}
