package com.feue.DesignPattern.StrategyPattern.v1;

/**
 * @author Feue
 * @create 2021-08-18 17:01
 */
public class DecoyDuck extends Duck{
    // 诱饵鸭是木头假鸭

    @Override
    public void quack() {

    }

    @Override
    public void display() {
        System.out.println("This is a decoy duck");
    }

    @Override
    public void fly() {

    }
}
