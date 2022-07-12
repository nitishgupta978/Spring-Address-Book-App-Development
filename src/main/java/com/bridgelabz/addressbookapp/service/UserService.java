package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.dto.UserLoginDTO;
import com.bridgelabz.addressbookapp.modle.UserRegistration;
import com.bridgelabz.addressbookapp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<ResponseDTO> addUser(UserDTO userLoginDTO) {
        UserRegistration newUser = new UserRegistration(userLoginDTO);
        UserRegistration userRegistration = userRepository.save(new UserRegistration(userLoginDTO));
        ResponseDTO responseDto = new ResponseDTO("User is created", userRegistration);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);

    }
    @Override
    public ResponseEntity<ResponseDTO> loginUser(UserLoginDTO userLoginDTO) {
        Optional<UserRegistration> user = userRepository.findByEmail(userLoginDTO.getEmail());
        boolean password = user.get().getPassword().equals(userLoginDTO.getPassword());
        if (password = false) {
            ResponseDTO responseDto = new ResponseDTO("login failed",  null);
            return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.UNAUTHORIZED);
        } else {
            ResponseDTO responseDto = new ResponseDTO(" Login Successfully", user);
            return  new ResponseEntity<>(responseDto, HttpStatus.OK);
        }
    }
}