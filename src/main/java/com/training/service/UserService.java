package com.training.service;

import com.training.dto.request.UserRequestDTO;
import com.training.model.entity.UserEntity;

public interface UserService {
    UserEntity createUser(UserRequestDTO requestUser);

    UserEntity findByUserEmail(String email);
}
