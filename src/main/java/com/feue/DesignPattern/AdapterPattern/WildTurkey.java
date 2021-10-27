package com.feue.DesignPattern.AdapterPattern;

/**
 * @author Feue
 * @create 2021-10-26 14:38
 * 野火鸡是火鸡的具体实现类
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
