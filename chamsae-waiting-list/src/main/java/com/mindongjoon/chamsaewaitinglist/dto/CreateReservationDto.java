package com.mindongjoon.chamsaewaitinglist.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateReservationDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String phoneNumber;
    @NotEmpty
    @AssertTrue
    private Boolean terms;
}
