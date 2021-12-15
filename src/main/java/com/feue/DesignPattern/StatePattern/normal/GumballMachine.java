package com.feue.DesignPattern.StatePattern.normal;

/**
 * @author Feue
 * @create 2021-12-15 11:46
 */
public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (this.state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (this.state == NO_QUARTER) {
            this.state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (this.state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (this.state == SOLD) {
            System.out.println("Please wait, we're already giving you gumball");
        }
    }

    public void ejectQuarter() {
        if (this.state == SOLD_OUT || this.state == NO_QUARTER) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        } else if (this.state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            this.state = NO_QUARTER;
        } else if (this.state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        }
    }

    public void turnCrank() {
        if (this.state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (this.state == NO_QUARTER) {
            System.out.println("You turned, but there's no quarter");
        } else if (this.state == HAS_QUARTER) {
            System.out.println("You turned...");
            this.state = SOLD;
            dispense();
        } else if (this.state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        }
    }

    public void dispense() {
        if (this.state == SOLD_OUT || this.state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        } else if (this.state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (this.state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            this.count--;
            if (this.count == 0) {
                System.out.println("Oops, out of gumballs!");
                this.state = SOLD_OUT;
            } else {
                this.state = NO_QUARTER;
            }
        }
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\n"
                +"Java-enabled Standing Gumball Model #2021\n"
                +"Inventory: 0 gumballs\n"
                +"Machine state is "+this.getState()+"\n";
    }

    private String getState() {
        switch (this.state) {
            case 0: return "SOLD_OUT";
            case 1: return "NO_QUARTER";
            case 2: return "HAS_QUARTER";
            case 3: return "SOLD";
            default: return "ILLEGAL";
        }
    }
}
