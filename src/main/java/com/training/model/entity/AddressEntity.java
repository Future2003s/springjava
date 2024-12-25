package com.training.model.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tbl_address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String apartmentNumber;

    String floor;

    String building;

    String streetNumber;

    String street;

    String city;

    String country;

    Integer addressType;
}
