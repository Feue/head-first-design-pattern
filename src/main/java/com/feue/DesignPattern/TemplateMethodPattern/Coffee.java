package com.feue.DesignPattern.TemplateMethodPattern;

/**
 * @author Feue
 * @create 2021-12-07 17:43
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
