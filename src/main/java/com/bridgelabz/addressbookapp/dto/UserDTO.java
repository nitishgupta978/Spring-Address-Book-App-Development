package com.bridgelabz.addressbookapp.dto;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class UserDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee  firstName is Not valid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message ="Employee lastName is Not valid")
    public String lastName;

    @Email
    public String email;

    @NotEmpty(message = "address can not be empty")
    public String address;

    @NotEmpty(message = "Password cant be empty")
    public String password;

}