package com.training.repository;

import com.training.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserEmail(String userEmail);

    boolean existsByUserEmail(String email);
}
