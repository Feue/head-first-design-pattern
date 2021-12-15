package com.feue.DesignPattern.SingletonPattern;

import java.util.Date;

/**
 * @author Feue
 * @create 2021-10-12 17:16
 *
 * 经典的单例模式
 */
public class ClassicSingleton {
    // 利用一个静态变量来记录 ClassicSingleton 类的唯一实例
    private static ClassicSingleton uniqueInstance;
    // 构造器声明为私有，只有自己类内才可以调用
    private ClassicSingleton() {}
    // 实例化对象，并返回这个实例
    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        long start = new Date().getTime();
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(ClassicSingleton.getInstance());
            });
            threads[i].start();
        }
        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }
        long end = new Date().getTime();
        System.out.println((end-start)+"ms");
    }
    
}
