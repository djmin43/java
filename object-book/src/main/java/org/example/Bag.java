package org.example;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;


    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }
        setTicket(ticket);
        minusAmount(ticket.getFee());
        return ticket.getFee();
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
