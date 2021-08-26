package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator;

import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 17:07
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
