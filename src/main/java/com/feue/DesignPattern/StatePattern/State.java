package com.feue.DesignPattern.StatePattern;

/**
 * @author Feue
 * @create 2021-12-15 15:54
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
