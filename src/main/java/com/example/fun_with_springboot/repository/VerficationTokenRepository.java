package com.example.fun_with_springboot.repository;

import com.example.fun_with_springboot.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerficationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
