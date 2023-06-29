package com.mindongjoon.chamsaewaitinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ChamsaeWaitingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChamsaeWaitingListApplication.class, args);
	}

}
