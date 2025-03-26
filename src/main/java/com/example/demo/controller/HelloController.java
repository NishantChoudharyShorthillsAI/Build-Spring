package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hey World! I am Nishant Choudary and I am in DevOps Team I am in my Office. And i am very happy to be here.Hey Devops Team abcdef test 1";
    }
}

