package com.example.LatestSpringSecurityBasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {

    @RequestMapping("/contact")
    public String contact(){
        return "This is my contact page";
    }
}
