package com.training.controller;


import com.training.dto.request.UserRequestDTO;
import com.training.dto.response.ResponseSuccess;
import com.training.exception.CustomException;
import com.training.model.entity.UserEntity;
import com.training.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping(value = "/v1/api")
public class UserController {
    final UserService userService;

    @PostMapping("/addUser")
    public ResponseSuccess<UserEntity> createUser(@RequestBody @Valid UserRequestDTO user) {
        return new ResponseSuccess<UserEntity>(HttpStatus.CREATED, "Register SuccessFully", userService.createUser(user));
    }


    @GetMapping("/user/{email}")
    public UserEntity findUserEmail(@PathVariable(name = "email", required = false) String email) {

        return userService.findByUserEmail(email);
    }

}
