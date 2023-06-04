package com.mindongjoon.securityendgame.controller;

import com.mindongjoon.securityendgame.model.LoginRequest;
import com.mindongjoon.securityendgame.model.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest request) {
        return LoginResponse.builder()
                .accessToken("blah")
                .build();

    }
}
