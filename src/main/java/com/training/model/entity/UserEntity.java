package com.training.model.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_usr")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity extends AbstractEntity {

    @Column(columnDefinition = "varchar(255) comment 'first name'", name = "firstName")
    String firstName;

    @Column(name = "usr_lastName")
    String lastName;


    @Column(unique = true)
    String userEmail;

    @Column(name = "usr_phone")
    String phone;

    @Column(name = "usr_dateOfBirth")
    @Temporal(TemporalType.DATE)
    Date dateOfBirth;


//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    Set<AddressEntity> address;

}
