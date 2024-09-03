package com.soares.ecommerce.repository;

import com.soares.ecommerce.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    @Query("{ 'email' : ?0 }")
    Optional<Customer> FindByEmail(String email);

}
