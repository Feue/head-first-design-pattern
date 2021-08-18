package com.feue.designpattern.StrategyPattern.v2;

/**
 * @author Feue
 * @create 2021-08-18 17:27
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
