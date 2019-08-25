package com.llz.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CatHandler implements InvocationHandler {

    private Animal target;

    public CatHandler(Animal target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("handler start");
        method.invoke(target, args);
        System.out.println("handler end");
        return null;
    }
}
