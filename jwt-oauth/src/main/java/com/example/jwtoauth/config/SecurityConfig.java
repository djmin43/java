package com.example.jwtoauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable()) // (1) Disable Cross-Site Request Forgery (CSRF)
                .authorizeRequests( auth -> auth
                        .anyRequest().authenticated() // (2) The user should be authenticated for any request in the application.
                )
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
                // (3) Spring Security will never create an HttpSession and it will never use it to obtain the Security Context.
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // (4) Spring Security’s HTTP Basic Authentication support is enabled by default.
                // However, as soon as any servlet-based configuration is provided, HTTP Basic must be explicitly provided.
                .httpBasic(Customizer.withDefaults())
                .build();
    }

    @Bean
    public InMemoryUserDetailsManager users() {
        return new InMemoryUserDetailsManager(
                User.withUsername("mindongjoon")
                        .password("{noop}password")
                        .authorities("read")
                        .build()
        );
    }
}
