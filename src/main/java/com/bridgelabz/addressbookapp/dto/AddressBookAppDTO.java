package com.bridgelabz.addressbookapp.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author Nitish kumar gupta
 * date 05/06/2022
 * call constructor getter&setter, to String Method
 */
public @ToString  class AddressBookAppDTO {
    /**
     * use @Data annotation for Auto generate getter and setter method
     */

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee name Invalid" )

    public String firstname;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee name Invalid" )
    public String lastname;

    @Pattern(regexp = "^[0-9]{6}$",message = "zipcode is invalid pleas enter 6 digit ")
    @NotBlank(message="Zip Code can't be Empty!!" )
    public long zipcode;

    @NotBlank(message="State name can't be Empty!!" )
    public String state;
    @NotBlank(message="City name can't be Empty!!" )
    public String city;

    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Phone Number is Invalid")
    public String phoneNumber;

    public AddressBookAppDTO(String firstname, String lastname, long zipcode, String state, String city, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }


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
