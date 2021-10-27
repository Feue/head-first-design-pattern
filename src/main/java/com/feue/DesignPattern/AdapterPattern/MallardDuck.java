package com.feue.DesignPattern.AdapterPattern;

/**
 * @author Feue
 * @create 2021-10-26 14:30
 * 绿头鸭是鸭子的子类
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
