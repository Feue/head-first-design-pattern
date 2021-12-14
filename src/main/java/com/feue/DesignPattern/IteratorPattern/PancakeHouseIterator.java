package com.feue.DesignPattern.IteratorPattern;

import java.util.ArrayList;

/**
 * @author Feue
 * @create 2021-12-10 16:04
 */
public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
