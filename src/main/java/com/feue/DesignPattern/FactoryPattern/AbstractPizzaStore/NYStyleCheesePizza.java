package com.feue.DesignPattern.FactoryPattern.AbstractPizzaStore;

/**
 * @author Feue
 * @create 2021-08-27 15:35
 */
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        douph = "Thin Crust Douph";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
