package com.feue.DesignPattern.FactoryPattern.AbstractPizzaStore;

import java.util.ArrayList;

/**
 * @author Feue
 * @create 2021-08-27 15:31
 */
public abstract class Pizza {
    String name;
    String douph;
    String sauce;

    ArrayList<String> toppings = new ArrayList<String>();
    
    void prepare() {
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
