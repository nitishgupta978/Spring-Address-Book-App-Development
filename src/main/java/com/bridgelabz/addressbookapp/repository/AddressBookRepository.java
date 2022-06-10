package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.modle.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Nitish Kumar Gupta
 * @Date 08-06-2022
 * Create interface AddressBookRepository
 */
@Repository
public interface AddressBookRepository  extends JpaRepository <AddressBookData, Integer>{
    @Query(value = "select *from address_book, address_branch where address_id = id and branch = :branch",nativeQuery = true)
    List<AddressBookData> findAddressByBranch(String branch);


    /**
     *
     * @param state
     * @return AddressState
     */
    @Query(value = "select * from address_book where state = :state",nativeQuery = true)
    List<AddressBookData>findAddressDataByState(String state);

    /**
     *
     * @param gender
     * @return  AddressGender
     */
    @Query(value = "select * from address_book where gender = :gender",nativeQuery = true)
    List<AddressBookData>findAddressDataByGender(String  gender);

    /**
     *
     * @param StartDate
     * @return AddressStartDateTime
     */
    @Query(value = "select * from address_book where StartDate = :StartDate",nativeQuery = true)
    List<AddressBookData>findAddressDataByStartDate(LocalDate StartDate);


}
