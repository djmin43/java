package com.example.mindongjoon.sbb.repository;

import com.example.mindongjoon.sbb.domain.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
}
