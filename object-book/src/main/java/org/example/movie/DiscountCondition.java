package org.example.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
