package com.mindongjoon.chamsaewaitinglist.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class CreateReservationDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String phoneNumber;
    @AssertTrue
    private Boolean isTermsAgreed;
}
