package com.example.fun_with_springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//had l class howa li ms2oul 3la Sicherheitskonfiguration für unsere Backened
@EnableWebSecurity //main Annotation
public class SecurityConfig extends WebSecurityConfigurerAdapter { //WebSecurityConfigurerAdapter hiya l base Class

    // 7ozma
    @Bean
    /*passwordRncoder ist a Interface ,
      -deswegen müssen wir manuelle innerhalb der Configuration Klass einen "Bean" erstellen
      -und dann irgdenwann,und irgendwo Autowired diese "Bean"PasswordEncoder"",erhalten wir BCryptpasswordENcoder zurück*/
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
        //BCRypt Hashing ist gut für Password ,weil Password spreichern als String ist sehr schlecht Idee
        //imagine our Data base is gehackt,deswegen müssen wir sicher dass es wäre sehr Schwer das zu hacken
    }


    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {

        // CSRF() Schutz für unsere Back-End deaktivieren,because CSTF() hauptsächlich auftreten können,wenn Sitzungen vorhanden sind
        //und wenn wir Cookies verwenden,um die Sicherheitsinformation als Rest-Api zu authentifizieren
        //wir werden Json-web-Token für Autorisierung verwerden deswegen können wir dise Zukunft sicher deaktivieren "csrf.disable"
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
