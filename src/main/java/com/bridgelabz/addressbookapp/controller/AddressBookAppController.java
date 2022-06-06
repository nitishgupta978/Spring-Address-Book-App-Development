package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.modle.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressBookAppController {

    @Autowired
    private IAddressBookService addressBookService;
    @RequestMapping(value = {"","/","get"})
    public ResponseEntity<ResponseDTO>getAddressBookData() {
        List<AddressBookData>addressBookDataList=null;
        addressBookDataList=  addressBookService.getAddressBookData();
            // addressBookData = new AddressBookData(1,new AddressBookAppDTO("John","Wick",845438,"Bihar","Bettiah","8882160058"));
            ResponseDTO responseDTO = new ResponseDTO("Get call Successful", addressBookDataList);
            return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
            /**
             * Method : Using  @RequestMapping(value = {"","/","get"}) to get the all data
             * return: return all data of AddressBook Data
             * here use ResponseDTO and AddressBookData
             * and here Implement service layer
             * Autowired Annotation will be used to do Dependency Injection of the Services Object to
             *  the Controller.
             *
             */
        }

    @GetMapping("/get/{addId}")
    public ResponseEntity<ResponseDTO>getAddressBookData (@PathVariable ("addId") int addressId){
        AddressBookData addressBookData = null;
        //addressBookData = new AddressBookData(2,new AddressBookAppDTO("John","Wick",845438,"Bihar","Bettiah","8882160058"));
        addressBookData= addressBookService.getAddressBookDataById(addressId);
        ResponseDTO responseDTO = new ResponseDTO("Get call for addId Successful!",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
        /**
         * Method:Using @GetMapping("/get/{addId}") to get the by particular addId data
         * return: only addId data
         * using service layer
         */
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO>createAddressBookData(@RequestBody AddressBookAppDTO addressBookAppDTO){
        AddressBookData addressBookData = null;
        //addressBookData = new AddressBookData(1 ,addressBookAppDTO);
        addressBookData=addressBookService.createAddressBookData(addressBookAppDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create AddressBook Data for addId Successful!",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
        /**
         * Method: using @PostMapping("/create") to create the new Address Book Data
         * return: all create data
         */
    }

    @PutMapping("/update/{addId}")
    public ResponseEntity<ResponseDTO>updateAddressBookData(@RequestBody AddressBookAppDTO addressBookAppDTO){
        AddressBookData addressBookData = null;
       // addressBookData = new AddressBookData(1 ,addressBookAppDTO);
        addressBookData=addressBookService.updateAddressBookData(addressBookAppDTO);
        ResponseDTO responseDTO = new ResponseDTO("update Address Book Data for addId Successfully!",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
        /**
         * method : using @PutMapping("/update") to update the data of Address Book Data
         * return all data including by update data
         */
    }
    @DeleteMapping("/delete/{addId}")
    public ResponseEntity<ResponseDTO>deleteAddressBookData(@PathVariable("addId") int addressId){
        addressBookService.deleteAddressBookDataById(addressId);
        ResponseDTO responseDTO =  new ResponseDTO("Delete Successfully,Delete by addId:",addressId);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
        /**
         * Method : @DeleteMapping using for delete /{addId}, "Handler path "to delete the data by addId
         * return: remaining Address Book Data
         */
    }
}
