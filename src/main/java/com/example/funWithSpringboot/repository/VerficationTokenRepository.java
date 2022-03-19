package com.example.funWithSpringboot.repository;

import com.example.funWithSpringboot.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerficationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
