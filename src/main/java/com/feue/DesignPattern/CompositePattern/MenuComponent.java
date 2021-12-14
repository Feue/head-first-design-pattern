package com.feue.DesignPattern.CompositePattern;

import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-13 16:22
 *
 * 因为有些方法只对菜单项有意义，而有些则只对菜单有意义，
 * 默认实现是抛出UnsupportedOperationException异常。
 * 这样，如果菜单项或菜单不支持某个操作，它们就不需要做任何事情，
 * 直接继承默认实现就可以了。
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
}
