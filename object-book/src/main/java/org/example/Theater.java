package org.example;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {

    }
}

// Three purposes of software module
// 1. should function
// 2. should be easy to change
// 3. should be easy to comprehend