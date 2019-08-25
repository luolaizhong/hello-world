package com.llz.core.reflect;

import com.llz.core.proxy.Animal;
import com.llz.core.proxy.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //普通实例方法调用
        Animal animal = new Cat();
        animal.eat();
        System.out.println("====================");

        //反射方法调用
        Method method = animal.getClass().getDeclaredMethod("eat");
        method.invoke(animal);
    }
}
