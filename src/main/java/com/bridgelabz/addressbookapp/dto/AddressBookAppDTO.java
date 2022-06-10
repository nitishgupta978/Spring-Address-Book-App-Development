package com.bridgelabz.addressbookapp.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Nitish kumar gupta
 * date 05/06/2022
 * uSE @ToString
 */
public @ToString  class AddressBookAppDTO {
    /**
     * use @ToString for lombok annotation for Auto generate getter and setter method
     */

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="firstname name Invalid" )

    public String firstname;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="lastname name Invalid" )
    public String lastname;

   @Pattern(regexp = "^[1-9]{1}[0-9]{5}$",message = "zipcode is invalid pleas enter 6 digit ")
    @NotBlank(message="Zip Code can't be Empty!!" )
    public String zipcode;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "state name is Invalid")
    @NotBlank(message="State name can't be Empty!!" )
    public String state;
//    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z-9]{2,}$",message = "city name  is Invalid")
//    @NotBlank(message="City name can't be Empty!!" )
//    public String city;

    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Phone Number is Invalid")
    public String phoneNumber;
//    @Pattern(regexp = "male|female|others",message = "Gender needs to male, female or others")
//    public String gender;

    //@JsonFormat(pattern = "dd MMM yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @NotNull(message = "StartDate should Not be Empty")
    @PastOrPresent(message = "Start Date Should be past or peasant Data")
    public LocalDate startDate;

//    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z-9]{2,}$",message = "city name  is Invalid")
    @NotNull(message = "department should be not Empty")
    public List<String>city;

    public AddressBookAppDTO(String firstname, String lastname, String zipcode, String state,  String phoneNumber,
                             LocalDate startDate,  List<String> city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
        this.state = state;
       this.city = city;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
//        this.branch = branch;
    }

//    public AddressBookAppDTO(String firstname, String lastname, String zipcode, String state, String city, String phoneNumber) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.zipcode = zipcode;
//        this.state = state;
//        this.city = city;
//        this.phoneNumber = phoneNumber;
//    }

}
