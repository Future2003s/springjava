package com.training.model.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_usr")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(columnDefinition = "varchar(255) comment 'first name'", name = "firstName")
    String firstName;

    @Column(name = "usr_lastName")
    String lastName;

    @Column(name = "usr_email")
    String email;

    @Column(name = "usr_phone")
    String phone;

    @Column(name = "usr_dateOfBirth")
    @Temporal(TemporalType.DATE)
    Date dateOfBirth;


    @CreationTimestamp
    String createdAt;

    @UpdateTimestamp
    String updatedAt;
}
