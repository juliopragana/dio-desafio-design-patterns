package br.com.notifications.service;

import java.util.ArrayList;
import java.util.List;

import br.com.notifications.interfaces.Observer;

//Subject (Publicador)
public class NotificationService {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
      observers.add(observer);
  }

  public void removeObserver(Observer observer) {
      observers.remove(observer);
  }

  public void notifyObservers(String message) {
      for (Observer observer : observers) {
          observer.update(message);
      }
  }

}
