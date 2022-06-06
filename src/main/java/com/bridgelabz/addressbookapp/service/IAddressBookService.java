package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.modle.AddressBookData;

import java.util.List;

public interface IAddressBookService  {
    List<AddressBookData>getAddressBookData();
    AddressBookData getAddressBookDataById(int addressId);
    AddressBookData createAddressBookData(AddressBookAppDTO addressBookAppDTO);
    AddressBookData updateAddressBookData(AddressBookAppDTO addressBookAppDTO);
    void deleteAddressBookDataById(int addressId);
}
