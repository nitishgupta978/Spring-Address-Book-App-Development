package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookAppController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to AddressBook App Development !!";
    }

}
