package org.example.state;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Please insert only one quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("quarter inserted");
        } else if (state == SOLD_OUT) {
            System.out.println("sould out, plesae come again next time");
        } else if (state == SOLD) {
            System.out.println("gumblal ocming out");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("ejecting quarter");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("please insert a quarter");
        } else if (state == SOLD) {
            System.out.println("it is already sold");
        } else if (state == SOLD) {
            System.out.println("no coin inserted. not retruning the coin");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("please turn only once");
        } else if (state == NO_QUARTER) {
            System.out.println("please insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("it is sold out");
        } else if (state == HAS_QUARTER) {
            System.out.println("crank");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("gumball out");
            count = count - 1;
            if (count == 0) {
                System.out.println("no more gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("please insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("it is sold out");
        } else if (state == HAS_QUARTER) {
            System.out.println("cannot dispense gumball");
        }

    }

}
