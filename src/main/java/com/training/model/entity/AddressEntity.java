package com.training.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tbl_address")
public class AddressEntity extends AbstractEntity {
    String apartmentNumber;

    String floor;

    String building;

    String streetNumber;

    String street;

    String city;

    String country;

    Integer addressType;
}
