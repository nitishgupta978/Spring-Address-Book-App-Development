package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.modle.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
    @Autowired
    private AddressBookRepository addressBookRepository;
    private List<AddressBookData>addressBookDataList=new ArrayList<>();

    /**
     * Method: List ,ArrayList
     * @return  store the  Data in a Memory as a List.
     *
     */
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList= new ArrayList<>();
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addressId) {
        //,AddressBookData addressBookData= null;
       // return addressBookDataList.get(addressId-1);
        return addressBookDataList.stream().filter(addressBookData ->addressBookData.getAddressId()==addressId)
                .findFirst().orElseThrow(()->new AddressBookException("Employee not found By Id"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookAppDTO addressBookAppDTO) {
        AddressBookData addressBookData=null;
       // addressBookData= new AddressBookData(1,addressBookAppDTO);
        addressBookData=new AddressBookData(addressBookDataList.size()+1,addressBookAppDTO);
        log.debug("AddressBook Data"+addressBookData.toString());
        addressBookDataList.add(addressBookData);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int addressId ,AddressBookAppDTO addressBookAppDTO) {
        AddressBookData addressBookData=this.getAddressBookDataById(addressId);
        addressBookData.setFirstname(addressBookAppDTO.firstname);
        addressBookData.setState(addressBookAppDTO.state);
        addressBookData.setPhoneNumber(addressBookAppDTO.phoneNumber);
        addressBookDataList.set(addressId-1,addressBookData);
        return addressBookData;
    }

    @Override
    public  void deleteAddressBookDataById(int addressId) {
    addressBookDataList.remove(addressId-1);

    }

    @Override
    public List<AddressBookData> getAddressBookDataByState(String state) {
        return null;
    }

    @Override
    public List<AddressBookData> getAddressBookDataByStartDate(LocalDate startDate) {
        return null;
    }

    @Override
    public List<AddressBookData> getAddressBookDataByGender(String gender) {
        return null;
    }

    @Override
    public List<AddressBookData> getAddressBookDataByDepartment(String department) {
        return null;
    }
}
