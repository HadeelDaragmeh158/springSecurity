package com.sp.secu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/user-contacts")
    public String getUserContactsDetails() {

        return "Getting contacts details From DB !!";
    }
}