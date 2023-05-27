package com.example.mindongjoon.sbb.repository;

import com.example.mindongjoon.sbb.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}