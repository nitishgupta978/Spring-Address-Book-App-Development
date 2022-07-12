package com.bridgelabz.addressbookapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class UserLoginDTO {

    @Email
    private String email;
    @NotEmpty(message = "Password cant be null")
    private String password;

}