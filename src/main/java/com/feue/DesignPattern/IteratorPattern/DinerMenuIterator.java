package com.feue.DesignPattern.IteratorPattern;

import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-10 15:28
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item util you've done at least one next()");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < items.length-1; i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
