package com.feue.DesignPattern.IteratorPattern;

import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-10 16:13
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName()+", ");
            System.out.print(item.getPrice()+" -- ");
            System.out.println(item.getDescription());
        }
    }
    //其他方法
}
