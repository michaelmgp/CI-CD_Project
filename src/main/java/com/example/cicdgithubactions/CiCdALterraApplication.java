package com.example.cicdgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CiCdALterraApplication {

    @GetMapping
    public String welcome(){
        return "Welcome to Michael's Page";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdALterraApplication.class, args);
    }

}
