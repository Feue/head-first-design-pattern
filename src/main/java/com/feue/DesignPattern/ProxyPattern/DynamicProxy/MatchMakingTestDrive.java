package com.feue.DesignPattern.ProxyPattern.DynamicProxy;


import java.lang.reflect.Proxy;

/**
 * @author Feue
 * @create 2021-12-22 15:33
 */
public class MatchMakingTestDrive {
    private PersonBean joe;

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        joe = new Person();
        joe.setName("Joe");
        joe.setGender("male");
        joe.setInterests("none");
    }

    public void drive() {
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is "+ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is "+ownerProxy.getHotOrNotRating());

        System.out.println();

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is "+nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is "+nonOwnerProxy.getHotOrNotRating());
    }

    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
