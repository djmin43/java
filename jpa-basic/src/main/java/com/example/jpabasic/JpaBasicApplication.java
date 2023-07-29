package com.example.jpabasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class JpaBasicApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JpaBasicApplication.class, args);

			Scanner scan = new Scanner(System.in);


			String[] input = scan.nextLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[0]);


			List<String> answerList = new ArrayList<>();

			for (int i = 1; i <= m; i ++) {
				List<String> lineList = new ArrayList<>();
				for (int j = 1; j <= n; j ++) {
					// odd
					if (i % 2 != 0) {
						lineList.a("#");
						// even
					} else {
						lineList.push(".");
					}
				}
				answerList.push(lineList);
			}


			String tt = answerList.toString();
			System.out.println(tt);



	}

}
