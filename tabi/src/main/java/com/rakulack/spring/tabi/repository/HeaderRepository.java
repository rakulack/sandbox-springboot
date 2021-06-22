package com.rakulack.spring.tabi.repository;

import java.util.List;
import java.util.Optional;

import com.rakulack.spring.tabi.entity.Header;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeaderRepository extends JpaRepository<Header, Long> {
    Optional<Header> findByHash(String hash);

    List<Header> findByUserIdOrderByPrcDate(Long userId);
}
