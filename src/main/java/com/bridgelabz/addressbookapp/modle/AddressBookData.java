package com.bridgelabz.addressbookapp.modle;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * create AddressBook Data ; this is essentially a data Model that will eventually save in the DB
 */
@Entity
@Table(name = "address_book")
public @Data  class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private int addressId;

    private String state;
    private String phoneNumber;

    private String firstname;
    private String lastname;

    private String emailId;

    private String zipcode;
     private String city;
    private String address;

    public AddressBookData(){}
    public AddressBookData(AddressBookAppDTO addressBookAppDTO){
        this.updateAddressBookData(addressBookAppDTO);
    }

    public  void updateAddressBookData(AddressBookAppDTO addressBookAppDTO) {
        this.firstname = addressBookAppDTO.firstname;
        this.lastname = addressBookAppDTO.lastname;
        this.state =addressBookAppDTO.state;
        this.phoneNumber = addressBookAppDTO.phoneNumber;
        this.address = addressBookAppDTO.address;
        this.emailId = addressBookAppDTO.emailId;
        this.zipcode = addressBookAppDTO.zipcode;
        this.city=addressBookAppDTO.city;


    }



}
