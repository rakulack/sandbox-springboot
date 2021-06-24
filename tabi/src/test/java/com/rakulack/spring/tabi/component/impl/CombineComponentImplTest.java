package com.rakulack.spring.tabi.component.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rakulack.spring.tabi.controller.edit.BlockForm;
import com.rakulack.spring.tabi.entity.Place;
import com.rakulack.spring.tabi.entity.Route;

import org.junit.jupiter.api.Test;

public class CombineComponentImplTest {

        @Test
        void createBlockFormTest() {
                List<Place> places = new ArrayList<Place>();
                List<Route> routes = new ArrayList<Route>();
                places.add(new Place(Long.valueOf(1), Long.valueOf(1), "1番目の目的地", "1番目の記事", Integer.valueOf(10),
                                Integer.valueOf(30), Integer.valueOf(12), Integer.valueOf(30), "test1@url.com",
                                "test1@url.com", new Date()));
                places.add(new Place(Long.valueOf(2), Long.valueOf(1), "2番目の目的地", "2番目の記事", Integer.valueOf(13),
                                Integer.valueOf(00), Integer.valueOf(14), Integer.valueOf(30), "test2@url.com",
                                "test2@url.com", new Date()));
                places.add(new Place(Long.valueOf(3), Long.valueOf(1), "3番目の目的地", "3番目の記事", Integer.valueOf(15),
                                Integer.valueOf(00), Integer.valueOf(15), Integer.valueOf(30), "test3@url.com",
                                "test2@url.com", new Date()));
                routes.add(new Route(Long.valueOf(1), Long.valueOf(1), "1番目の経路", Integer.valueOf(12),
                                Integer.valueOf(30), Integer.valueOf(13), Integer.valueOf(00), new Date()));
                routes.add(new Route(Long.valueOf(2), Long.valueOf(1), "2番目の経路", Integer.valueOf(14),
                                Integer.valueOf(30), Integer.valueOf(15), Integer.valueOf(00), new Date()));
                List<BlockForm> blockForms = new CombineComponentImpl().combine(places, routes);
                assertEquals(blockForms.get(0).getOrd(), Long.valueOf(1));
                assertEquals(blockForms.get(0).getRouteFromHour(), Integer.valueOf(12));
                assertEquals(blockForms.get(0).isHasRoute(), true);
                assertEquals(blockForms.get(1).isHasRoute(), true);
                assertEquals(blockForms.get(2).isHasRoute(), false);
                assertEquals(blockForms.get(1).getOrd(), Long.valueOf(2));
                assertEquals(blockForms.get(2).getOrd(), Long.valueOf(3));

        }

}
