package com.mindongjoon.securityendgame.dto;

import lombok.Data;

@Data
public class MemberCreationRequestDTO {
    private String username;
    private String password;
    private String email;
}
