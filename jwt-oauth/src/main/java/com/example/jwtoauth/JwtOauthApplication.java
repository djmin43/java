package com.example.jwtoauth;

import com.example.jwtoauth.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class JwtOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtOauthApplication.class, args);
	}

}
