package com.example.LatestSpringSecurityBasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAccount {

    @RequestMapping("/account")
    public String myAccount(){
        return "This is my account page";
    }
}
