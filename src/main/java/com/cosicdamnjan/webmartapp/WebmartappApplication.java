package com.cosicdamnjan.webmartapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebmartappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmartappApplication.class, args);
    }

    @GetMapping("/greet")
    public String hello() {
        return "hello";
    }
}
