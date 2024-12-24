package com.training.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api")
public class UserController {

    @GetMapping("/ping")
    public String test() {
        return "pong";
    }
}
