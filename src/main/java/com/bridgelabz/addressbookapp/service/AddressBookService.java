package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookAppDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.modle.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{
    @Autowired
    private AddressBookRepository addressBookRepository;
    //private List<AddressBookData>addressBookDataList=new ArrayList<>();

    /**
     * Method: List ,ArrayList
     * @return  store the  Data in a Memory as a List.
     *
     */
    @Override
    public List<AddressBookData> getAddressBookData() {
        //ist<AddressBookData> addressBookDataList= new ArrayList<>();
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int addressId) {
//        return addressBookDataList.stream().filter(addressBookData ->addressBookData.getAddressId()==addressId)
//                .findFirst().orElseThrow(()->new AddressBookException("Employee not found By Id"));
        return addressBookRepository.findById(addressId).orElseThrow(()-> new AddressBookException("Address Book addressId"+addressId+"does not exist!!"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookAppDTO addressBookAppDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(addressBookAppDTO);
        log.debug("AddressBook Data"+addressBookData.toString());
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int addressId ,AddressBookAppDTO addressBookAppDTO) {
        AddressBookData addressBookData=this.getAddressBookDataById(addressId);
//        addressBookData.setFirstname(addressBookAppDTO.firstname);
//        addressBookData.setState(addressBookAppDTO.state);
//        addressBookData.setPhoneNumber(addressBookAppDTO.phoneNumber);
//        addressBookDataList.set(addressId-1,addressBookData);
//        return addressBookData;
        addressBookData.updateAddressBookData(addressBookAppDTO);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public  void deleteAddressBookDataById(int addressId) {
        AddressBookData addressBookData =this.getAddressBookDataById(addressId);
    //addressBookDataList.remove(addressId-1);
        addressBookRepository.delete(addressBookData);

    }

    @Override
    public List<AddressBookData> getAddressBookDataByState(String state) {
        return addressBookRepository.findAddressDataByState(state);
    }

    @Override
    public List<AddressBookData> getAddressBookDataByStartDate(LocalDate startDate) {
        return addressBookRepository.findAddressDataByStartDate(startDate);
    }

//    @Override
//    public List<AddressBookData> getAddressBookDataByGender(String gender) {
//        return addressBookRepository.findAddressDataByGender(gender);
//    }

    @Override
    public List<AddressBookData> getAddressBookDataByCity(String city) {
        return addressBookRepository.findAddressByCity(city);
    }
}
