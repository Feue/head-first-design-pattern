package com.feue.DesignPattern.DecoratorPattern.Starbuzz;

import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.Beverage;
import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.DarkRoast;
import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.Espresso;
import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Beverage.HouseBlend;
import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator.Mocha;
import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator.Soy;
import com.feue.DesignPattern.DecoratorPattern.Starbuzz.Decorator.Whip;

/**
 * @author Feue
 * @create 2021-08-26 17:10
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        // 浓缩咖啡
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // 双倍摩卡奶泡深焙
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // 奶泡摩卡豆浆综合咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
