package com.feue.DesignPattern.TemplateMethodPattern.normal;

/**
 * @author Feue
 * @create 2021-12-07 16:36
 * 茶类用来泡茶
 */
public class Tea {
    /* 与咖啡的实现很像，其中第2和第4个步骤不一样，但基本上是相同的冲泡方法 */
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
    /* 下面四个方法，每个方法都实现了算法中的每一个步骤：煮沸水、冲泡茶叶、把茶倒进杯子、加柠檬。
    * boilWater()、pourIntoCup()这两个方法和咖啡的方法完全一样，出现了重复的代码。
    * steepTeaBag()、addLemon()是泡茶专有的。 */
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
