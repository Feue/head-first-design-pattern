package com.feue.DesignPattern.FactoryPattern.PizzaStore;

/**
 * @author Feue
 * @create 2021-08-27 14:49
 */
public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}
