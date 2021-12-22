package com.feue.DesignPattern.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Feue
 * @create 2021-12-22 12:22
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, InvocationTargetException {
        if(method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        }
        return method.invoke(person, args);
    }
}
