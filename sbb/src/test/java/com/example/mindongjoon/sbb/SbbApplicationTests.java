package com.example.mindongjoon.sbb;

import com.example.mindongjoon.sbb.domain.Question;
import com.example.mindongjoon.sbb.repository.QuestionRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		List<Question> all = this.questionRepository.findAll();
		Assertions.assertThat(all.size()).isEqualTo(2);



	}


}
