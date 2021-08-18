package com.feue.designpattern.StrategyPattern.v2;

/**
 * @author Feue
 * @create 2021-08-18 17:26
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
