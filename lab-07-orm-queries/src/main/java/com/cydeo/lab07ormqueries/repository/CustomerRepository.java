package com.cydeo.lab07ormqueries.repository;

import com.cydeo.lab07ormqueries.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Write a derived query to get all customer by id
   Optional<Customer> findById(Long id);
    //Write a JPQL query to get customer by email

    @Query("Select x from Customer x where x.email=?1")
    Customer findCustomerWithEmail(String email);

}
