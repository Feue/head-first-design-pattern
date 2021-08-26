package com.feue.DesignPattern.StrategyPattern.v1;

/**
 * @author Feue
 * @create 2021-08-18 16:59
 */
public class RubberDuck extends Duck{
    // 橡皮鸭
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }

    @Override
    public void display() {
        System.out.println("This is a rubber duck");
    }

    @Override
    public void fly() {

    }
}
