package com.example.funWithSpringboot.repository;

import com.example.funWithSpringboot.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
