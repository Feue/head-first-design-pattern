package com.feue.CompositePattern;

/**
 * @author Feue
 * @create 2021-12-13 16:41
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
