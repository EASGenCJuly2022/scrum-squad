package com.user.userservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    @Query(value="SELECT * FROM CUSTOMER WHERE first_name= ?1 AND last_name = ?2", nativeQuery=true)
    Customer findOneUser(String first, String last);
}
