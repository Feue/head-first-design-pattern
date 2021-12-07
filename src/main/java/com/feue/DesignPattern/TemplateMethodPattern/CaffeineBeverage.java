package com.feue.DesignPattern.TemplateMethodPattern;

/**
 * @author Feue
 * @create 2021-12-07 17:00
 * 咖啡因饮料超类
 */
public abstract class CaffeineBeverage {
    /* 现在，用同一个prepareRecipe()方法来处理茶和咖啡。方法声明为final，不希望子类去覆盖这个方法。
    * 将第2和第4个步骤泛化为brew()和addCondiments()。 */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /* 因为咖啡和茶处理这些方法的做法不同，所以这两个方法必须声明为抽象的，由子类去实现。 */
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
