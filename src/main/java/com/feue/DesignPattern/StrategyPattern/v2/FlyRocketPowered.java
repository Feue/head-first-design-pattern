package com.feue.DesignPattern.StrategyPattern.v2;

/**
 * @author Feue
 * @create 2021-08-18 17:40
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
