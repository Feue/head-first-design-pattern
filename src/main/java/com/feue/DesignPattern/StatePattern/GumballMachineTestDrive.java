package com.feue.DesignPattern.StatePattern;

/**
 * @author Feue
 * @create 2021-12-15 17:30
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine); // 打印机器状态

        gumballMachine.insertQuarter(); // 投入一枚硬币
        gumballMachine.turnCrank(); // 转动曲柄，应该拿到糖果

        System.out.println(gumballMachine); // 打印机器状态

        gumballMachine.insertQuarter(); // 投入一枚硬币
        gumballMachine.turnCrank(); // 转动曲柄，应该拿到糖果
        gumballMachine.insertQuarter(); // 投入一枚硬币
        gumballMachine.turnCrank(); // 转动曲柄，应该拿到糖果

        System.out.println(gumballMachine); // 打印机器状态
    }
}
