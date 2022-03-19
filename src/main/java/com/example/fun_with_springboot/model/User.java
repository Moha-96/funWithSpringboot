package com.example.fun_with_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;

    @NotBlank(message = "Username is required ")// labodamno ze3ma
    private String username;

    @NotBlank(message = "Password is required")
    private String password;
    @Email
    @NotEmpty
    private String email;

    private Instant created;
    //enabled könnte es aktiviert werden
    //user ist enable akter Email verfication
    private boolean enabled;




}
