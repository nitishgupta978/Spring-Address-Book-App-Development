package com.bridgelabz.addressbookapp.modle;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * create AddressBook Data ; this is essentially a data Model that will eventually save in the DB
 */
@Entity
public @Data  class AddressBookData {
    @Id

    private int addressId;
    private String firstname;
    private String state;
    private String phoneNumber;
    public AddressBookData(){}

    public AddressBookData(int addressId, AddressBookAppDTO addressBookAppDTO) {
        this.addressId = addressId;
        this.firstname = addressBookAppDTO.firstname;
        this.state =addressBookAppDTO.state;
        this.phoneNumber = addressBookAppDTO.phoneNumber;
    }



}
