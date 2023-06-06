package com.mindongjoon.securityendgame.service;

import com.mindongjoon.securityendgame.domain.MemberEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private static final String EXISTING_EMAIL = "test@test.com";
    public Optional<MemberEntity> findByEmail(String email) {
        // TODO: Move this to a database
        if (!EXISTING_EMAIL.equalsIgnoreCase(email)) return Optional.empty();

        MemberEntity user = new MemberEntity();
        user.setId(1L);
        user.setEmail(EXISTING_EMAIL);
        user.setPassword("$2a$12$BLGLK8dP9c9AoamvxIGQJeVYqzdeg8MnQo5Usf4hyRJuXPU/Qc5.q");
        user.setRole("ROLE_ADMIN");
        user.setExtraInfo("my nice admin");

        return Optional.of(user);
    }
}
