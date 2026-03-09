package com.sp.secu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/user-cards")
    public String getUserCardsDetails() {

        return "Getting cards details From DB !!";
    }
}