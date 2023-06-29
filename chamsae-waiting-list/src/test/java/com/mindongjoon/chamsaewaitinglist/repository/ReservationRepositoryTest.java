package com.mindongjoon.chamsaewaitinglist.repository;

import com.mindongjoon.chamsaewaitinglist.domain.Reservation;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReservationRepositoryTest {

    @Autowired
    ReservationRepository reservationRepository;

    @BeforeAll
    void init() {
        Reservation test123 = Reservation.createNewReservation("filler", "01071994154", true);
        Long test123Id = reservationRepository.add(test123);
    }

    @Test
    void add() {
        //given
        List<Reservation> reservations = reservationRepository.findAll();
        assertThat(reservations.size()).isEqualTo(1);
        //when
        Reservation test123 = Reservation.createNewReservation("test123", "123456", true);
        Long test123Id = reservationRepository.add(test123);
        Reservation newReservation = reservationRepository.findOne(test123Id);
        //then
        assertThat(test123Id).isEqualTo(test123.getId());
        assertThat(newReservation.getName()).isEqualTo("test123");
    }

    @Test
    void remove() {
    }

    @Test
    void toggleIsResolved() {
    }

    @Test
    void findAll() {
    }
}