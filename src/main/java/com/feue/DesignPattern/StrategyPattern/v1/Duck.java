package com.feue.DesignPattern.StrategyPattern.v1;

/**
 * @author Feue
 * @create 2021-08-18 16:53
 */
public class Duck {

    public void quack() {
        System.out.println("Quack Quack");
    }

    public void swim() {
        System.out.println("Duck swim");
    }

    public void display() {
        System.out.println("This is a duck");
    }

    public void fly() {
        System.out.println("Duck fly");
    }
}
