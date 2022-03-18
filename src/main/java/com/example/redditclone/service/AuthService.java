package com.example.redditclone.service;

import com.example.redditclone.dto.RegisterRequest;
import com.example.redditclone.model.User;
import com.example.redditclone.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@AllArgsConstructor
public class AuthService {
    public void singup(RegisterRequest registerRequest){


        final PasswordEncoder passwordEncoder;
        final UserRepository userRepository;


        // müssen wir eine Objekt erstellen von User class
        //jetzt haben die Data und dann wir werden die Daten zuorden von RegisterObjekt zu UserObjekt

        User user =new User();
        user.setUsername(registerRequest.getUserName());
        user.setEmail(registerRequest.getEmail());
        // db n9edro n3iyto 3la encode
        user.setPassword(registerRequest.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);// hier bei default werden wir User deaktivieren "disable"
    }
}
