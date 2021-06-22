package com.rakulack.spring.tabi.repository;

import java.util.List;

import com.rakulack.spring.tabi.entity.Route;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findByHeaderIdOrderById(Long headerId);
}
