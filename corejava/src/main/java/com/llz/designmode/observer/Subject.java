package com.llz.designmode.observer;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyMessage(String message);
}
