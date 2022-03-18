package com.example.redditclone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    // 7ozma
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
        //BCRypt Hashing ist gut für ,weil Password spreicher als String ist sehr schlecht Idee
        //imagine our Data base is gehackt,deswegen müssen wir sicher dass es wäre sehr Schwer das zu hacken
    }


    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        //wir werden Json-web-Token für Autorisierung deswegen können wir dise Zukunft sicher deaktivieren "csrf.disable"
        httpSecurity.csrf().disable().
                authorizeHttpRequests().
                antMatchers("/api/auth/**").
                permitAll()
                .anyRequest()
                .authenticated();
                //hier oben wir wollten dass Alle eigehenden Anfrage an unsere BackAnd Api zulassen.dei mit url "/api/auth/**"
                // und wir stellen sicher ,dass alle eine andere Anfrage ,die nicht mit diesem Pattern Übereinstimmt,sollte authentifiziert werden

    }
}
