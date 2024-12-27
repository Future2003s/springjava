package com.training.service.impl;

import com.training.dto.request.UserRequestDTO;
import com.training.dto.response.ResponseError;
import com.training.exception.CustomException;
import com.training.model.entity.UserEntity;
import com.training.repository.UserRepository;
import com.training.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    @Override
    public UserEntity createUser(UserRequestDTO requestUser) {
        try {
            UserEntity checkEmail = userRepository.findByUserEmail(requestUser.getEmail());
        } catch (Exception e) {
            throw new CustomException("Email exitst !!!");
        }

        UserEntity user = UserEntity.builder()
                .firstName(requestUser.getFirstName())
                .lastName(requestUser.getLastName())
                .userEmail(requestUser.getEmail())
                .phone(requestUser.getPhone())
                .dateOfBirth(requestUser.getDateOfBirth())
                .build();

        userRepository.save(user);
        return user;
    }

    @Override
    public UserEntity findByUserEmail(String email) {
        return userRepository.findByUserEmail(email);
    }


}
