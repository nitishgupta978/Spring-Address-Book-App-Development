package com.bridgelabz.addressbookapp.modle;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * create AddressBook Data ; this is essentially a data Model that will eventually save in the DB
 */
@Entity
public class AddressBookData {
    @Id

    private int addressId;
    private String firstname;
    private String state;
    private String phoneNumber;
    public AddressBookData(){}

    public AddressBookData(int addressId, AddressBookAppDTO addressBookAppDTO) {
        this.addressId = addressId;
        this.firstname = addressBookAppDTO.getFirstname();
        this.state =addressBookAppDTO.state;
        this.phoneNumber = addressBookAppDTO.phoneNumber;
    }


    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
