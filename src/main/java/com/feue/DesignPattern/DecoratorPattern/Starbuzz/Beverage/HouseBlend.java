package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 16:56
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        // 综合
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
