package com.mindongjoon.chamsaewaitinglist.controller;

import com.mindongjoon.chamsaewaitinglist.domain.Reservation;
import com.mindongjoon.chamsaewaitinglist.dto.CreateReservationDto;
import com.mindongjoon.chamsaewaitinglist.repository.ReservationRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
        return reservationRepository.add(Reservation.createNewReservation(dto.getName(), dto.getPhoneNumber(), dto.getIsTermsAgreed()));
    }

    @PutMapping("/reservation/toggle/{id}")
    public Boolean toggle(@PathVariable("id") Long id) {
        return reservationRepository.toggleIsResolved(id);
    }
}
