package com.example.funWithSpringboot.controller;

import com.example.funWithSpringboot.dto.RegisterRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/singup")
    //wir nennen wie sowie diese Klassen "RegistrationRequest" Dto ,was eine Daten├╝bertragenObjekt bedeutet
    //DTO "Data Transfer Object"
    public void signup(@RequestBody RegisterRequestDto registerRequestDto){

    }
}
