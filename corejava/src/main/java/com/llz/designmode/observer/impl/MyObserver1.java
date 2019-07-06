package com.llz.designmode.observer.impl;

import com.llz.designmode.observer.Observer;

public class MyObserver1 implements Observer {
    public void update(String message) {
        System.out.println("myobserver1:" + message);
    }
}
