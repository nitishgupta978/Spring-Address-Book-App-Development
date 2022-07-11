package com.bridgelabz.addressbookapp.repository;


import com.bridgelabz.addressbookapp.modle.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<UserRegistration,Integer> {
    @Query(value = "select * from user_detail where email=?1 password = ?2", nativeQuery = true)
    Long findByPassword(String email, String password);


    @Query(value = " select  * from user_detail id=?1", nativeQuery = true)
    UserRegistration getById(String id);

    Optional<UserRegistration> findByEmail(String email);

}