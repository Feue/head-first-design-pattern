package com.feue.DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-13 16:34
 */
public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> components = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("___________________");

        Iterator<MenuComponent> iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            component.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(components.iterator());
    }
}
