package com.mindongjoon.chamsaewaitinglist.controller;

import com.mindongjoon.chamsaewaitinglist.domain.Reservation;
import com.mindongjoon.chamsaewaitinglist.dto.CreateReservationDto;
import com.mindongjoon.chamsaewaitinglist.repository.ReservationRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationRepository reservationRepository;

    @GetMapping("/reservation/list")
    public List<Reservation> getList() {
        return reservationRepository.findAll();
    }

    @PostMapping("/reservation")
    public Long createReservation(@RequestBody @Valid CreateReservationDto dto) {
        return reservationRepository.add(Reservation.createNewReservation(dto.getName(), dto.getPhoneNumber(), dto.getTerms()));
    }
}
