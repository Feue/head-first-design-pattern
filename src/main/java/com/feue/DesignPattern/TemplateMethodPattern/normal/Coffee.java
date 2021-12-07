package com.feue.DesignPattern.TemplateMethodPattern.normal;

/**
 * @author Feue
 * @create 2021-12-07 16:29
 * 咖啡类用来煮咖啡。
 */
public class Coffee {

    /* 咖啡冲泡法 */
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
    /* 下面四个方法，每个方法都实现了算法中的每一个步骤：煮沸水、冲泡咖啡、把咖啡倒进杯子、加糖和奶 */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
