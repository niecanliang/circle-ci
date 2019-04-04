package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CircleCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleCiApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return String.valueOf(System.currentTimeMillis());
    }
}
