package com.rakulack.spring.tabi.repository;

import java.util.Optional;

import com.rakulack.spring.tabi.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
