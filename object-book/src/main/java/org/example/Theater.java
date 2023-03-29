package org.example;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}

// Three purposes of software module
// 1. should function
// 2. should be easy to change
// 3. should be easy to comprehend

// NOTE: 객체를 인터페이스와 구현으로 나누고,
// 인터페이스만을 공개하는 것은 객체 사이의 결합도를 낮추고
// 변경하기 쉬운 코드를 작성하기 위해 따라야 하는 가장 기본적인 설계 원칙이다. (pg. 21)