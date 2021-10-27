package com.feue.DesignPattern.AdapterPattern;

/**
 * @author Feue
 * @create 2021-10-26 14:40
 * 首先，需要实现想转换成的类型接口，也就是客户希望看到的接口。
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    // 接着，需要取得要适配的对象引用
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    // 然后实现接口中的所有方法
    @Override
    public void quack() {
        turkey.gobble();
    }
    // 火鸡飞行距离短，要让火鸡和鸭子的飞行距离对应，需要连续调用5次火鸡的fly()
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
