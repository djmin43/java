package com.mindongjoon.chamsaewaitinglist.repository;

import com.mindongjoon.chamsaewaitinglist.domain.Reservation;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReservationRepository {

    private final EntityManager em;

    @Transactional
    public Long add(Reservation newReservation) {
        em.persist(newReservation);
        return newReservation.getId();
    }

    @Transactional
    public Long remove(Long id) {
        Reservation reservation = em.find(Reservation.class, id);
        em.remove(reservation);
        return reservation.getId();
    }

    @Transactional
    public Boolean toggleIsResolved(Long id) {
        Reservation reservation = em.find(Reservation.class, id);
        return Reservation.toggleIsResolved(reservation);
    }

    public List<Reservation> findAll() {
        return em.createQuery("SELECT u FROM Reservation u", Reservation.class)
                .getResultList();
    }


}
