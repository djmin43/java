package com.mindongjoon.securityendgame.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@Getter
@Setter
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String email;

    @JsonIgnore
    private String password;

    private String role;

    private String extraInfo;
}
