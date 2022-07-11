package com.bridgelabz.addressbookapp.repository;

        import com.bridgelabz.addressbookapp.modle.AddressBookData;
        import org.springframework.boot.env.ConfigTreePropertySource;
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
     * @param startDate
     * @return AddressStartDateTime
     */
    @Query(value = "select * from address_book where start_date = :startDate",nativeQuery = true)
    List<AddressBookData>findAddressDataByStartDate(String startDate);

    @Query(value = "select * from address_book where email_id = :emailId",nativeQuery = true)
    List<AddressBookData> findAddressByEmailId(String emailId);

    //List<AddressBookData> findAddressByEmailId(String emailId);

    @Query(value = "select *from  address_book order by city asc", nativeQuery = true)
    List<AddressBookData> sortByCity();
    @Query(value = "select *from  address_book order by state asc", nativeQuery = true)
    List<AddressBookData> sortByState();
    
    @Query(value = "select *from  address_book order by firstname asc", nativeQuery = true)
    List<AddressBookData> sortByName();

    @Query(value = "select *from  address_book order by email_id asc", nativeQuery = true)
    List<AddressBookData> sortByEmailId();
}