package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 16:58
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
