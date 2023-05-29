package com.mindongjoon.securityendgame.dto;

import lombok.Data;

@Data
public class MemberCreationDTO {
    private String username;
    private String password;
    private String email;
}
