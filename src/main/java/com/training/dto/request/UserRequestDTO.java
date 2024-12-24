package com.training.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
public class UserRequestDTO implements Serializable {

    @NotEmpty(message = "first Name can not empty")
    @Size(min = 5,message = "first Name Minimum 5 character")
    private String firstName;

    @NotEmpty(message = "last name can not empty")
    @Size(min = 5,message = "last name Minimum 5 character")
    private String lastName;

    @NotEmpty(message = "email can not empty")
    @Size(min = 5,message = "email Minimum 5 character")
    private String email;

    @NotEmpty(message = "phone can not empty")
    @Size(max = 10,message = "phone maximum 10 number")
    @Size(min = 10,message = "phone Minimum 10 number")
    private  String phone;

    @NotNull(message = "date of birth must be not null")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "DD/MM/YYYY")
    private Date dateOfBirth;

}
