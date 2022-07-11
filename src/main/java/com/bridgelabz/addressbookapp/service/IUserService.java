package com.bridgelabz.addressbookapp.service;


import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.dto.UserLoginDTO;
import org.springframework.http.ResponseEntity;


public interface IUserService {

    ResponseEntity<ResponseDTO> addUser(UserLoginDTO userLoginDTO);
    ResponseEntity<ResponseDTO> loginUser(UserLoginDTO userLoginDTO);
}
