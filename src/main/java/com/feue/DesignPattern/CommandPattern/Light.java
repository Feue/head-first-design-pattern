package com.feue.DesignPattern.CommandPattern;

/**
 * @author Feue
 * @create 2021-10-13 15:21
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name+" light is on");
    }

    public void off() {
        System.out.println(name+" light is off");
    }
}
