package com.feue.DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-10 15:32
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> items;

    public PancakeHouseMenu() {
        this.items = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false, 2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true, 3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true, 3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        items.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return items.iterator();
    }
    // 还有很多其他方法
}
