package com.soares.ecommerce.model;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String city;
    private String neighborhood;
    private String zipCode;
    private String houseNumber;
}
