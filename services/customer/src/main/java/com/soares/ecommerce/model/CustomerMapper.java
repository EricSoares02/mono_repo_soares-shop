package com.soares.ecommerce.model;

import com.soares.ecommerce.types.CustomerRequest;

public class CustomerMapper {

    public Customer build(CustomerRequest customer){

        return Customer.builder()
                .id(customer.id())
                .email(customer.email())
                .password(customer.password())
                .firstname(customer.firstname())
                .lastname(customer.lastname())
                .address(customer.address())
                .build();
    }

}
