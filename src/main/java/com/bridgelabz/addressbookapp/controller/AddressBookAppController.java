package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.modle.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
//using for @CrossOrigin to connect backend to fronted
@RestController
@Slf4j
@RequestMapping("/addressbook")
public class AddressBookAppController {

    @Autowired
    private IAddressBookService addressBookService;
    @GetMapping("/get")
    public ResponseEntity<ResponseDTO>getAddressBookData() {
        List<AddressBookData>addressBookDataList=null;
        addressBookDataList=  addressBookService.getAddressBookData();
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
        addressBookData= addressBookService.getAddressBookDataById(addressId);
        ResponseDTO responseDTO = new ResponseDTO("Get call for addId Successful!",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
        /**
         * Method:Using @GetMapping("/get/{addId}") to get the by particular addId data
         * return: only addId data
         * using service layer
         */
    }
    @GetMapping("/getAddressByCity/{city}")
    public ResponseEntity<ResponseDTO>getAddressBookDataByCity(@PathVariable("city") String city){
        List<AddressBookData>addressBookDataList=null;
        addressBookDataList=addressBookService.getAddressBookDataByCity(city);
        ResponseDTO responseDTO = new ResponseDTO("Get Call For city Successfully",addressBookDataList);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);

    }

    /**
     * @author Nitish Kumar Gupta
     * @Date : 08-06-2022
     * Method :
     */
    @GetMapping("/getAddressDetailsByState/{state}")
    public ResponseEntity<ResponseDTO>getAddressBookDataByState(@PathVariable("state") String state) {
        List<AddressBookData>addressBookDataList= null;
        addressBookDataList = addressBookService.getAddressBookDataByState(state);
        ResponseDTO responseDTO = new ResponseDTO("Get Call For state is successfully",addressBookDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/sortByCity")
    public ResponseEntity<ResponseDTO> sortByCity() {
        List<AddressBookData> addressBookList = null ;
        addressBookList = addressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("Sort by city call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    //   To get state in ascending order
    @GetMapping("/get/sortByState")
    public ResponseEntity<ResponseDTO> sortByState() {
        List<AddressBookData> addressBookList = null;
        addressBookList = addressBookService.sortAddressBookByState();
        ResponseDTO responseDTO = new ResponseDTO("Sort by state call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/sortByName")
    public ResponseEntity<ResponseDTO> sortByFirstName() {
        List<AddressBookData> addressBookList = null;
        addressBookList = addressBookService.sortAddressBookByFirstName();
        ResponseDTO responseDTO = new ResponseDTO("Sort by name call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/sortByEmailId")
    public ResponseEntity<ResponseDTO> sortByEmailId() {
        List<AddressBookData> addressBookList = null;
        addressBookList = addressBookService.sortAddressBookByEmailId();
        ResponseDTO responseDTO = new ResponseDTO("Sort by emailId call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/getAddressByEmailId/{emailId}")
    public ResponseEntity<ResponseDTO>getAddressBookDataByEmailId(@PathVariable("emailId") String emailId){
        List<AddressBookData>addressBookDataList=null;
       addressBookDataList= addressBookService.getAddressBookDataByEmailId(emailId);
        ResponseDTO responseDTO=new ResponseDTO("Get call For EmailId is Successfully...",addressBookDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }



    @PostMapping("/create")
    public ResponseEntity<ResponseDTO>createAddressBookData(@Valid @RequestBody AddressBookAppDTO addressBookAppDTO){
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
    public ResponseEntity<ResponseDTO>updateAddressBookData(@PathVariable("addId") int addressId, @RequestBody AddressBookAppDTO addressBookAppDTO){
        AddressBookData addressBookData = null;
       // addressBookData = new AddressBookData(1 ,addressBookAppDTO);
        addressBookData = addressBookService.updateAddressBookData(addressId,addressBookAppDTO);
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
