package com.bridgelabz.addressbookapp.controller;


import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.dto.UserLoginDTO;
import com.bridgelabz.addressbookapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(allowedHeaders="*",origins="*")
@RestController
@RequestMapping("UserRegistration")
public class UserRegistrationController {

    @Autowired
    IUserService userRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> addUser(@Valid @RequestBody UserDTO userLoginDTO) {
        return userRegistrationService.addUser(userLoginDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> loginUser(@RequestBody UserLoginDTO userLoginDTO) {
        return userRegistrationService.loginUser(userLoginDTO);
    }

}