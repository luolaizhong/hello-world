package com.llz.designmode.observer.impl;

import com.llz.designmode.observer.Observer;
import com.llz.designmode.observer.Subject;

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
