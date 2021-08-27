package com.feue.DesignPattern.FactoryPattern.AbstractPizzaStore;

/**
 * @author Feue
 * @create 2021-08-27 15:34
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
