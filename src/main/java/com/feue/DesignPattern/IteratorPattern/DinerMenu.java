package com.feue.DesignPattern.IteratorPattern;

import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-10 15:45
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] items;

    public DinerMenu() {
        items = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Faking') Bacon with lettuce & tomato on whole wheat",
                true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hot dog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            items[numberOfItems++] = item;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(items);
    }
    // 其他方法
}
