package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.modle.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList= new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookAppDTO("John","Wick",845438,"MP","Bhopal","8882160058")));

        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addressId) {
        AddressBookData addressBookData= null;
        addressBookData= new AddressBookData(1,new AddressBookAppDTO("Nitish","Gupta",845438,"Bihar","Patna","8882160058"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookAppDTO addressBookAppDTO) {
        AddressBookData addressBookData=null;
        addressBookData= new AddressBookData(1,addressBookAppDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookAppDTO addressBookAppDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookAppDTO);
        return addressBookData;
    }

    @Override
    public  void deleteAddressBookDataById(int addressId) {


    }
}
