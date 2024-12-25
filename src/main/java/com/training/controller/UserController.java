package com.training.controller;


import com.training.dto.request.UserRequestDTO;
import com.training.dto.response.ResponseSuccess;
import com.training.model.entity.UserEntity;
import com.training.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
