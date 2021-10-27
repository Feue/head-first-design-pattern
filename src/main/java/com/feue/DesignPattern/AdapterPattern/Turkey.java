package com.feue.DesignPattern.AdapterPattern;

/**
 * @author Feue
 * @create 2021-10-26 14:36
 */
public interface Turkey {
    // 火鸡不会呱呱叫，只会咯咯(gobble)叫。
    public void gobble();
    // 火鸡会飞，但飞不远。
    public void fly();
}
