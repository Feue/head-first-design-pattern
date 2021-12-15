package com.feue.DesignPattern.StatePattern;

import java.util.Random;

/**
 * @author Feue
 * @create 2021-12-15 16:19
 */
public class HasQuarterState implements State {
    private GumballMachine gumballMachine;
    private Random random;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = this.random.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        } else {
            this.gumballMachine.setState(this.gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "HAS_QUARTER";
    }
}
