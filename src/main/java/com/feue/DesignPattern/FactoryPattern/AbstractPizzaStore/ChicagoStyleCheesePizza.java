package com.feue.DesignPattern.FactoryPattern.AbstractPizzaStore;

/**
 * @author Feue
 * @create 2021-08-27 15:54
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        douph = "Extra Think Crust Douph";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
