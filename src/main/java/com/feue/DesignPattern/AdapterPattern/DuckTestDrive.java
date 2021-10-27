package com.feue.DesignPattern.AdapterPattern;

/**
 * @author Feue
 * @create 2021-10-26 14:48
 * 测试适配器
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        // 创建一只鸭子
        MallardDuck duck = new MallardDuck();
        // 创建一只火鸡
        WildTurkey turkey = new WildTurkey();
        // 将火鸡包装进适配器，使它看起来像是一只鸭子。
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        // 测试火鸡
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        // 使用testDuck()测试鸭子
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        // 使用testDuck()测试火鸡假扮的鸭子
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
