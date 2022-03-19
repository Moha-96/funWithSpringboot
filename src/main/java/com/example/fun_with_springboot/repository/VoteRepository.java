package com.example.fun_with_springboot.repository;

import com.example.fun_with_springboot.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
