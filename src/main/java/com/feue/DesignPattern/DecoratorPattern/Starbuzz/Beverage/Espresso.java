package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 16:55
 */
public class Espresso extends Beverage {

    public Espresso() {
        // 浓缩
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
