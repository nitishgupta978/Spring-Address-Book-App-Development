package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

/**
 * @author Nitish kumar gupta
 * date 05/06/2022
 * call constructor getter&setter, to String Method
 */
public @Data class AddressBookAppDTO {
    /**
     * use @Data annotation for Auto generate getter and setter method
     */

    public String firstname;
    public String lastname;
    public long zipcode;
    public String state;
    public String city;
    public String phoneNumber;

    public AddressBookAppDTO(String firstname, String lastname, long zipcode, String state, String city, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public long getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(long zipcode) {
//        this.zipcode = zipcode;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber =phoneNumber;
//    }

    @Override
    public String toString() {
        return "AddressBookAppDTO{" +
                "firstname='" + firstname + '\n' +
                ", lastname='" + lastname + '\n' +
                ", zipcode=" + zipcode +
                ", state='" + state + '\n' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\n' +
                '}';
    }
}
