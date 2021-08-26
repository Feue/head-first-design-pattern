package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator;

import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 17:02
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
