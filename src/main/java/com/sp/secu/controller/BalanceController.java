package com.sp.secu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/user-balance")
    public String getUserBalanceDetails() {

        return "Getting balance details From DB !!";
    }
}