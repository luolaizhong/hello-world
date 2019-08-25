package com.llz.core.proxy;

public class CatProxy implements Animal {
    private Cat cat;

    public CatProxy(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void eat() {
        cat.eat();
    }
}
