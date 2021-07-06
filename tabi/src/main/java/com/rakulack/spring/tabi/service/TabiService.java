package com.rakulack.spring.tabi.service;

import java.util.List;

import com.rakulack.spring.tabi.entity.Header;
import com.rakulack.spring.tabi.entity.Place;
import com.rakulack.spring.tabi.entity.Route;

public interface TabiService {
    void save(Header header, List<Place> place, List<Route> route);

    Header loadHeader(String hash);

    List<Place> loadPlace(Long headerId);

    List<Route> loadRoute(Long headerId);
}
