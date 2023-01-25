package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SomeRepositoryTest {

    @Autowired
    SomeRepository someRepository;

    @Test
    void someTest() {
        Member member = new Member();
        someRepository.someTest(member);
    }

}