package designmode.observer.impl;

import designmode.observer.Observer;

public class MyObserver2 implements Observer {
    public void update(String message) {
        System.out.println("myobserver2:" + message);
    }
}
