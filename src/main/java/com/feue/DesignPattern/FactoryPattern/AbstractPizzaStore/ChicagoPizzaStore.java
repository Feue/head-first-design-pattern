package com.feue.DesignPattern.FactoryPattern.AbstractPizzaStore;

/**
 * @author Feue
 * @create 2021-08-27 15:58
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
