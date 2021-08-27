package com.feue.DesignPattern.FactoryPattern.AbstractPizzaStore;

/**
 * @author Feue
 * @create 2021-08-27 15:32
 */
public abstract class PizzaStore {
    abstract Pizza createPizza(String item);
    Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    };
}
