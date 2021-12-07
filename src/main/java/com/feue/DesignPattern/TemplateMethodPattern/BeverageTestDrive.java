package com.feue.DesignPattern.TemplateMethodPattern;

/**
 * @author Feue
 * @create 2021-12-07 18:11
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
