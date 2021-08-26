package com.feue.DesignPattern.StrategyPattern.v2;

/**
 * @author Feue
 * @create 2021-08-18 17:29
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
