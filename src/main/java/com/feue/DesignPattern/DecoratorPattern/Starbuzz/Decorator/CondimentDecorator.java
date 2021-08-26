package com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator;

import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.Beverage;

/**
 * @author Feue
 * @create 2021-08-26 16:51
 *
 * 装饰者类
 *
 */
public abstract class CondimentDecorator extends Beverage {
    // 所有的调料装饰者都必须重新实现 getDescription()
    public abstract String getDescription();
}
