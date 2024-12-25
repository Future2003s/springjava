package com.training.controller;


import com.training.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/api")
public class UserController {

   @PostMapping("/user")
    public UserRequestDTO createUser(@RequestBody @Valid UserRequestDTO user) {
        return user;
   }
}
