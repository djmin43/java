package com.mindongjoon.chamsaewaitinglist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
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

    private Reservation(String name, String phoneNumber, Boolean isTermsAgreed) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isTermsAgreed = isTermsAgreed;
        this.isResolved = false;
    }

    public static Reservation createNewReservation(String name, String phoneNumber, Boolean isTermsAgreed) {
        return new Reservation(name, phoneNumber, isTermsAgreed);
    }

    public static Boolean toggleIsResolved(Reservation reservation) {
        reservation.isResolved = !reservation.isResolved;
        return reservation.isResolved;
    }
}
