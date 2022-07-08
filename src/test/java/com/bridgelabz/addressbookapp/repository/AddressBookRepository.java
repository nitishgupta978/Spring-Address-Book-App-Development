package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.modle.AddressBookData;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
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
    @Query(value = "select *from address_book, address_city where address_id = id and city = :city",nativeQuery = true)
    List<AddressBookData> findAddressByCity(String city);


    /**
     *
     * @param state
     * @return AddressState
     */
    @Query(value = "select * from address_book where state = :state",nativeQuery = true)
    List<AddressBookData>findAddressDataByState(String state);

    /**
     *
     * @param StartDate
     * @return AddressStartDateTime
     */
    @Query(value = "select * from address_book where StartDate = :StartDate",nativeQuery = true)
    List<AddressBookData>findAddressDataByStartDate(LocalDate StartDate);

    @Query(value = "select * from address_book where emailId = :emailId",nativeQuery = true)
    List<AddressBookData> findAddressByEmail(String emailId, boolean b);

//    AddressBookAppDTO findAddressByEmailId(String tempEmailId);
}
