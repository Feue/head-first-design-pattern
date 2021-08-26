package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 17:00
 */
public class Decaf extends Beverage {

    public Decaf() {
        // 低咖啡因
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
