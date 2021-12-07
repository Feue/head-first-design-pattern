package com.feue.DesignPattern.TemplateMethodPattern;

/**
 * @author Feue
 * @create 2021-12-07 17:42
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
