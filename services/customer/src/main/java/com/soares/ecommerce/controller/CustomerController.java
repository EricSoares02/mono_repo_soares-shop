package com.soares.ecommerce.controller;

import com.soares.ecommerce.model.Customer;
import com.soares.ecommerce.service.CustomerService;
import com.soares.ecommerce.types.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;


    @PostMapping
    public ResponseEntity<String> createCustomer(
            @RequestBody @Valid CustomerRequest request
            ){

        return ResponseEntity.ok(service.createCustomer(request));
    }


    @GetMapping("{id}")
    public ResponseEntity<Customer> getUserById(
            @PathVariable String id
    ){

        return ResponseEntity.ok(service.getCostumerById(id));
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(
            @RequestBody @Valid CustomerRequest request
    ){

        return ResponseEntity.ok(service.updateCustomer(request));
    }


    @DeleteMapping("{id}")
    public void deleteCustomer(
            @PathVariable String id
    ){

        service.deleteCustomer(id);
    }
}
