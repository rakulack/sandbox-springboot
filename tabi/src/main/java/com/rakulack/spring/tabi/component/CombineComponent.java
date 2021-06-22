package com.rakulack.spring.tabi.component;

import java.util.List;

import com.rakulack.spring.tabi.controller.block.BlockForm;
import com.rakulack.spring.tabi.entity.Place;
import com.rakulack.spring.tabi.entity.Route;

public interface CombineComponent {
    public List<BlockForm> combine(List<Place> places, List<Route> routes);
}
