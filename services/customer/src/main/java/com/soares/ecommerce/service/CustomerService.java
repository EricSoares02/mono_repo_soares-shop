package com.soares.ecommerce.service;

import com.soares.ecommerce.model.Customer;
import com.soares.ecommerce.model.CustomerMapper;
import com.soares.ecommerce.repository.CustomerRepository;
import com.soares.ecommerce.types.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

     public String createCustomer(CustomerRequest customer){

        // verificar se já existe user com esse email
         if (this.getCustomerByEmail(customer.email()).isPresent()) {
             return null;
         }
        // criptografar senha

        return repository.save(new CustomerMapper().build(customer)).getId();
    }


    public Customer getCostumerById(String id){

        return repository.findById(id).orElseThrow(()-> new RuntimeException("Not Found User"));
    }

    public Optional<Customer> getCustomerByEmail(String email){

       return repository.FindByEmail(email);

    }

    public Customer updateCustomer(CustomerRequest customer){

         return repository.save(new CustomerMapper().build(customer));
    }


    public void deleteCustomer(String id){

         repository.deleteById(id);
    }


}
