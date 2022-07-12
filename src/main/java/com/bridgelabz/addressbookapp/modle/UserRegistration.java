package com.bridgelabz.addressbookapp.modle;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.dto.UserLoginDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor

public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String password;

    public UserRegistration(UserDTO userLoginDTO) {
        this.firstName = userLoginDTO.firstName;
        this.lastName = userLoginDTO.lastName;
        this.email = userLoginDTO.email;
        this.address = userLoginDTO.address;
        this.password = userLoginDTO.password;
    }


}
