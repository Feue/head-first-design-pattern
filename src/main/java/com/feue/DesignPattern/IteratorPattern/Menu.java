package com.feue.DesignPattern.IteratorPattern;

import java.util.Iterator;

/**
 * @author Feue
 * @create 2021-12-10 17:04
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
