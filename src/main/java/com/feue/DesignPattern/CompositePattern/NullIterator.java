package com.feue.DesignPattern.CompositePattern;

import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-14 14:31
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
