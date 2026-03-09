package com.sp.secu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/user-account")
    public String getUserAccountDetails() {

        return "Getting account details From DB !!";
    }
}