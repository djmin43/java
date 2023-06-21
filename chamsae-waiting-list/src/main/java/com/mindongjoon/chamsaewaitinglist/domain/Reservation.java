package com.mindongjoon.chamsaewaitinglist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phoneNumber;
    private Boolean isTermsAgreed;
    private Boolean isResolved;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime lastModifiedAt;

    private Reservation(String name, String phoneNumber, Boolean isTermsAgreed, Boolean isResolved) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isTermsAgreed = isTermsAgreed;
        this.isResolved = isResolved;
    }

    public static Reservation createNewReservation(String name, String phoneNumber, Boolean isTermsAgreed, Boolean isResolved) {
        return new Reservation(name, phoneNumber, isTermsAgreed, isResolved);
    }

    public static Boolean toggleIsResolved(Reservation reservation) {
        reservation.isResolved = !reservation.isResolved;
        return reservation.isResolved;
    }
}
