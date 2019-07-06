package designmode.observer.impl;

import designmode.observer.Observer;
import designmode.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);

    }

    public void notifyMessage(final String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
