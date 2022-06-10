package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.modle.AddressBookData;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public interface IAddressBookService  {
    List<AddressBookData>getAddressBookData();
    AddressBookData getAddressBookDataById(int addressId);
    AddressBookData createAddressBookData(AddressBookAppDTO addressBookAppDTO);
    AddressBookData updateAddressBookData( int addressId, AddressBookAppDTO addressBookAppDTO);
    void deleteAddressBookDataById(int addressId);

    List<AddressBookData> getAddressBookDataByState(String state);

    List<AddressBookData> getAddressBookDataByStartDate(LocalDate startDate);

    List<AddressBookData> getAddressBookDataByGender(String gender);

    List<AddressBookData> getAddressBookDataByBranch(String branch);
}
