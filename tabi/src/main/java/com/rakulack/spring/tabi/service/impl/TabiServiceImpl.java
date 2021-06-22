package com.rakulack.spring.tabi.service.impl;

import java.util.List;

import com.rakulack.spring.tabi.entity.Header;
import com.rakulack.spring.tabi.entity.Place;
import com.rakulack.spring.tabi.entity.Route;
import com.rakulack.spring.tabi.repository.HeaderRepository;
import com.rakulack.spring.tabi.repository.PlaceRepository;
import com.rakulack.spring.tabi.repository.RouteRepository;
import com.rakulack.spring.tabi.service.TabiService;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TabiServiceImpl implements TabiService {

    private final HeaderRepository headerRepository;
    private final PlaceRepository placeRepository;
    private final RouteRepository routeRepository;

    public TabiServiceImpl(HeaderRepository headerRepository, PlaceRepository placeRepository,
            RouteRepository routeRepository) {
        this.headerRepository = headerRepository;
        this.placeRepository = placeRepository;
        this.routeRepository = routeRepository;
    }

    @Transactional
    @Override
    public void save(Header header, List<Place> places, List<Route> routes) {
        if (null == header.getHash()) {
            header.setHash(makeHash());
        }
        headerRepository.save(header);
        // HeaderIdを取ってくる
        if (header.getId() == null) {
            Long headerId = headerRepository.findByHash(header.getHash()).get().getId();
            places.forEach(p -> p.setHeaderId(headerId));
            routes.forEach(r -> r.setHeaderId(headerId));
        }
        places.forEach(p -> placeRepository.save(p));
        routes.forEach(r -> routeRepository.save(r));
    }

    private String makeHash() {
        return RandomStringUtils.randomAlphabetic(20);
    }

    @Override
    public Header loadHeader(String hash) {
        return headerRepository.findByHash(hash).get();
    }

    @Override
    public List<Place> loadPlace(Long headerId) {
        return placeRepository.findByHeaderIdOrderById(headerId);
    }

    @Override
    public List<Route> loadRoute(Long headerId) {
        return routeRepository.findByHeaderIdOrderById(headerId);
    }

}
