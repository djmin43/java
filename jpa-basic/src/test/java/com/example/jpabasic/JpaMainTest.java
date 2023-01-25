package com.example.jpabasic;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpaMainTest {

    @Test
    @Transactional
    void someTest() {
        JpaMain jpaMain = new JpaMain();
        jpaMain.someTest();

    }

}