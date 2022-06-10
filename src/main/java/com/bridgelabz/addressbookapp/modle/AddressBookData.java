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
@Table(name = "address_books")
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

    private String zipcode;
    @ElementCollection
    @CollectionTable(name = "address_branch",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "branch")
     private List<String>branch;

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
        this.branch = addressBookAppDTO.branch;
        this.zipcode = addressBookAppDTO.zipcode;
    }



}
