package com.llz.core.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //普通实例方法调用
        Cat cat = new Cat();
        cat.eat();
        System.out.println("===================");

        CatProxy catProxy = new CatProxy(cat);
        //静态代理
        catProxy.eat();
        System.out.println("===================");

        //动态代理
        CatHandler catHandler = new CatHandler(cat);
        Animal cat2 = (Animal) Proxy.newProxyInstance(cat.getClass().getClassLoader(), cat.getClass().getInterfaces(), catHandler);
        cat2.eat();
    }
}
