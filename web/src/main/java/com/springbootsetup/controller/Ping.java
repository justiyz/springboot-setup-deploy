package com.springbootsetup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {


    @GetMapping("/ping")
    public String index() {
        return "Hello there!!!!!!!!!!!!";
    }
}
