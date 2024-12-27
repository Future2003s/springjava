package com.training.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;

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

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "userId")
//    UserEntity user;
}
