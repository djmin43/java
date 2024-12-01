package org.example.proxy;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("location of machine" + machine.getLocation());
        System.out.println("count" + machine.getCount());

    }
}
