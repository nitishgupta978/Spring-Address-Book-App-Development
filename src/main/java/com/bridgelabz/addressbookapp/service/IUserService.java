package com.bridgelabz.addressbookapp.service;


import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.dto.UserLoginDTO;
import org.springframework.http.ResponseEntity;

public interface IUserService {

    ResponseEntity<ResponseDTO> addUser(UserDTO userLoginDTO);
    ResponseEntity<ResponseDTO> loginUser(UserLoginDTO userLoginDTO);
}
