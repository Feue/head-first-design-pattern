package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator;

import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 17:06
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
