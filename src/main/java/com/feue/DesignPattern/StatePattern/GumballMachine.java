package com.feue.DesignPattern.StatePattern;

/**
 * @author Feue
 * @create 2021-12-15 15:57
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = this.soldOutState;
    private int count = 0;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            this.state = this.noQuarterState;
        }
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (this.count != 0) {
            this.count--;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println(count+" gumballs were filled in Gumball Machine");
        if (this.state == this.soldOutState) {
            this.state = this.noQuarterState;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\n"
                +"Java-enabled Standing Gumball Model #2021\n"
                +"Inventory: 0 gumballs\n"
                +"Machine state is "+this.state+"\n";
    }
}
