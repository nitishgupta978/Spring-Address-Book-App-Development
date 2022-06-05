package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressBookAppController {
    @RequestMapping(value = {"","/","get"})
    public ResponseEntity<String>getAddressBookData(){
        return new ResponseEntity<String>("Get call Service", HttpStatus.OK);
        /**
         * Method : Using  @RequestMapping(value = {"","/","get"}) to get the all data
         * return: return all data of AddressBook Data
         */
    }
    @GetMapping("/get/{addId}")
    public ResponseEntity<String>getAddressAppController (@PathVariable ("addId") int addId){
        return new ResponseEntity<String>("Get call Success for Id:"+addId,HttpStatus.OK);
        /**
         * Method:Using @GetMapping("/get/{addId}") to get the by particular addId data
         * return: only addId data
         */
    }
    @PostMapping("/create")
    public ResponseEntity<String>createAddressBookData(@RequestBody AddressBookAppDTO addressBookAppDTO){
        return new ResponseEntity<String>("Create Address Book Data successFull!!:"+addressBookAppDTO,HttpStatus.OK);
        /**
         * Method: using @PostMapping("/create") to create the new Address Book Data
         * return: all create data
         */
    }

    @PutMapping("/update")
    public ResponseEntity<String>updateAddressBookData(@RequestBody AddressBookAppDTO addressBookAppDTO){
        return new ResponseEntity<String>("Update AddressBook SuccessFull:"+addressBookAppDTO,HttpStatus.OK);
        /**
         * method : using @PutMapping("/update") to update the data of Address Book Data
         * return all data including by update data
         */
    }
    @DeleteMapping("/delete/{addId}")
    public ResponseEntity<String>deleteAddressBookData(@PathVariable("addId") int addId){
        return new ResponseEntity<String>("Delete Address Book Data!"+addId,HttpStatus.OK);
        /**
         * Method : @DeleteMapping using for delete /{addId}, "Handler path "to delete the data by addId
         * return: remaining Address Book Data
         */
    }
}
