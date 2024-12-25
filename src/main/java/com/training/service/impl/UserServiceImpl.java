package com.training.service.impl;

import com.training.dto.request.UserRequestDTO;
import com.training.model.entity.UserEntity;
import com.training.repository.UserRepository;
import com.training.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    @Override
    public UserEntity createUser(UserRequestDTO requestUser) {
        UserEntity user = UserEntity.builder()
                .firstName(requestUser.getFirstName())
                .lastName(requestUser.getLastName())
                .email(requestUser.getEmail())
                .phone(requestUser.getPhone())
                .dateOfBirth(requestUser.getDateOfBirth())
                .build();

        userRepository.save(user);
        return user;
    }
}
