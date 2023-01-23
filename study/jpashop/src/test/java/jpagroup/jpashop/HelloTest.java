package jpagroup.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void testLombok () {
        Hello hello = new Hello();
        hello.setData("hello");
        String testData = hello.getData();
        Assertions.assertThat(testData).isEqualTo("hello");

    }

}