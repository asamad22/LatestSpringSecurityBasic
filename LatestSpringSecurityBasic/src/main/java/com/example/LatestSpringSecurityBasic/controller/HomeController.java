package com.example.LatestSpringSecurityBasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    public String home(){
        return "Welcome:: This is home page";
    }
}
