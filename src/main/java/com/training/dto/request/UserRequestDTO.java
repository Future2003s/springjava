package com.training.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.training.util.PhoneNumber;
import com.training.util.UserStatus;
import jakarta.validation.constraints.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDTO implements Serializable {

    @NotEmpty(message = "first Name can not empty")
    @Size(min = 5, message = "first Name Minimum 5 character")
    String firstName;

    @NotEmpty(message = "last name can not empty")
    @Size(min = 5, message = "last name Minimum 5 character")
    String lastName;

    @NotEmpty(message = "email can not empty")
    @Size(min = 5, message = "email Minimum 5 character")
    @Email(message = "Email not format !!")
    String email;

    @NotEmpty(message = "phone can not empty")
    @Size(min = 10, max = 10, message = "phone must be exactly 10 characters")
    @PhoneNumber
    String phone;


    //    @Pattern(regexp = "^ACTIVE|INACTIVE|NONE$", message = "status must be one in {ACTIVE,INACTIVE,NONE}")
    UserStatus status;


    @NotNull(message = "date of birth must be not null")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    Date dateOfBirth;

}
