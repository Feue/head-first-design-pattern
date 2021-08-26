package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 16:49
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
