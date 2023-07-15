package com.example.jpabasic;

import com.example.jpabasic.repository.JPARepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JPABasicTest {

    @Autowired
    JPARepository jpaRepository;


    @Test
    public void hello() {
        jpaRepository.realExample();
    }


}
