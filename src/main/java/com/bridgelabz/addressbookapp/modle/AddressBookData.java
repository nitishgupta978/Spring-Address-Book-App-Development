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
    @Column(name = "name")
    private String firstname;
    private String state;
    private String phoneNumber;
     private String gender;
     private LocalDate startDate;
     private String notes;
     private String profilePic;
    @ElementCollection
    @CollectionTable(name = "address_department",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
     private List<String>department;

    public AddressBookData(){}
    public AddressBookData(AddressBookAppDTO addressBookAppDTO){
        this.updateAddressBookData(addressBookAppDTO);
    }

    public  void updateAddressBookData(AddressBookAppDTO addressBookAppDTO) {
        this.firstname = addressBookAppDTO.firstname;
        this.state =addressBookAppDTO.state;
        this.phoneNumber = addressBookAppDTO.phoneNumber;
        this.gender = addressBookAppDTO.gender;
        this.startDate = addressBookAppDTO.startDate;
        this.notes = addressBookAppDTO.notes;
        this.profilePic = addressBookAppDTO.profilePic;
        this.department = addressBookAppDTO.department;
    }

//    public   AddressBookData(int addressId, AddressBookAppDTO addressBookAppDTO) {
//        this.addressId = addressId;
//        this.firstname = addressBookAppDTO.firstname;
//        this.state =addressBookAppDTO.state;
//        this.phoneNumber = addressBookAppDTO.phoneNumber;
//        this.gender = addressBookAppDTO.gender;
//        this.startDate = addressBookAppDTO.startDate;
//        this.notes = addressBookAppDTO.notes;
//        this.profilePic = addressBookAppDTO.profilePic;
//        this.department = addressBookAppDTO.department;
//    }



}
