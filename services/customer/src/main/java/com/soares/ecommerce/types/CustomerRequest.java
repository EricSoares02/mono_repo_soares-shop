package com.soares.ecommerce.types;

import com.soares.ecommerce.model.Address;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        @NotNull(message = "id is Required")
         String id,

        @NotNull(message = "id is Required")
         String firstname,

        @NotNull(message = "id is Required")
         String lastname,

        @NotNull(message = "id is Required")
        @Email
         String email,

        @NotNull(message = "id is Required")
         String password,

        @NotNull(message = "id is Required")
         Address address
){


}
