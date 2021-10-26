package com.feue.DesignPattern.SingletonPattern;

/**
 * @author Feue
 * @create 2021-10-12 17:45
 *
 * 单例 Practice
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 在锅炉内填充巧克力和牛奶的混合物
        }
    }

    // ...

    private boolean isEmpty() {
        return empty;
    }
}
