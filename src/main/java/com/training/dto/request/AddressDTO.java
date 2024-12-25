package com.training.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressDTO implements Serializable {
    @NotBlank(message = "floor not allow empty !")
    String floor;

    @NotBlank(message = "apartmentNumber not allow empty !")
    String apartmentNumber;

    @NotBlank(message = "streetNumber not allow empty !")
    String streetNumber;

    @NotBlank(message = "address not allow empty !")
    String address;

    @NotBlank(message = "city not allow empty !")
    String city;

    @NotBlank(message = "city not allow empty !")
    String country;

    @NotBlank(message = "addressType not allow empty !")
    Integer addressType;
}
