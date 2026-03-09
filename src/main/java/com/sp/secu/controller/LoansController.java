package com.sp.secu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/user-loans")
    public String getUserLoansDetails() {

        return "Getting loans details From DB !!";
    }
}