package com.example.redditclone.service;

import com.example.redditclone.dto.RegisterRequestDto;
import com.example.redditclone.model.User;
import com.example.redditclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class AuthService {



    /**da es jetzt Password unserer User user in Datenbank zu spreichern
     * dafür brauchen wir UserRepository*/
    @Autowired
    private UserRepository userRepository;



    //die bekommt eine RegisterRequestDto als Input
    public void singup(RegisterRequestDto registerRequestDto){

        // müssen wir eine Objekt erstellen von User class
        User user =new User();


        //jetzt haben wir die Data und dann wir werden die Daten zuorden von RegisterObjekt zu UserObjekt
        user.setUsername(registerRequestDto.getUserName());
        user.setEmail(registerRequestDto.getEmail());

        // db n9edro n3iyto 3la encode funktion mn Interface passwordEncoder
        user.setPassword(passwordEncoder.encode(registerRequestDto.getPassword()));
        user.setCreated(Instant.now());//java Klasse zur aktuellen Zeit verwenden
        user.setEnabled(false);// hier bei default werden wir "User" deaktivieren "disable"==> "Enable- Flag= True"
    }
}
