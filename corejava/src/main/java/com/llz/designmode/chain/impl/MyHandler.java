package com.llz.designmode.chain.impl;

import com.llz.designmode.chain.Handler;

public class MyHandler implements Handler {

    private String name;

    private Handler handler;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name + " done!");
        if (getHandler() != null) {
            getHandler().operate();
        }
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
