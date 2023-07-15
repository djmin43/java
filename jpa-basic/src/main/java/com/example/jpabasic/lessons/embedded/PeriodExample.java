package com.example.jpabasic.lessons.embedded;

import lombok.Data;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Data
public class PeriodExample {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
