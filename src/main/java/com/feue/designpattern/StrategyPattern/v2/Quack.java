package com.feue.designpattern.StrategyPattern.v2;

/**
 * @author Feue
 * @create 2021-08-18 17:27
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
