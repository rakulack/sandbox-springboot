package com.rakulack.spring.tabi.repository;

import java.util.List;

import com.rakulack.spring.tabi.entity.Place;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
    List<Place> findByHeaderId(String headerId);
}
