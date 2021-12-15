package com.feue.DesignPattern.SingletonPattern;

import java.util.Date;

/**
 * @author Feue
 * @create 2021-10-13 14:27
 *
 * 双重锁校验单例  线程安全且性能好
 */
public class DoubleLockCheckSingleton {
    private static volatile DoubleLockCheckSingleton instance;

    private DoubleLockCheckSingleton() {}

    public static DoubleLockCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockCheckSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        long start = new Date().getTime();
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(DoubleLockCheckSingleton.getInstance());
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
