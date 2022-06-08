package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.modle.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nitish Kumar Gupta
 * @Date 08-06-2022
 * Create interface AddressBookRepository
 */
public interface AddressBookRepository  extends JpaRepository < AddressBookData, Integer>{

}
