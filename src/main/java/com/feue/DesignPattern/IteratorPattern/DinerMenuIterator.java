package com.feue.DesignPattern.IteratorPattern;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-10 15:28
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK)%2;
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
        MenuItem item = items[position];
        position += 2;
        return item;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item util you've done at least one next()");
        }
        if (items[position-1] != null) {
            if (items.length - position >= 0)
                System.arraycopy(items, position, items, position - 1, items.length - position);
            items[items.length-1] = null;
        }
    }
}
