package com.feue.DesignPattern.CompositePattern;

import java.util.*;

/**
 * @author Feue
 * @create 2021-12-14 14:13
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    private Deque<Iterator<MenuComponent>> stack = new ArrayDeque<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return this.hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (this.hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}
