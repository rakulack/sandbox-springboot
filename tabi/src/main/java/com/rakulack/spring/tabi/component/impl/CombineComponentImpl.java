package com.rakulack.spring.tabi.component.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.rakulack.spring.tabi.component.CombineComponent;
import com.rakulack.spring.tabi.controller.block.BlockForm;
import com.rakulack.spring.tabi.entity.Place;
import com.rakulack.spring.tabi.entity.Route;

import org.springframework.stereotype.Component;

@Component
public class CombineComponentImpl implements CombineComponent {

    /**
     * placeとrouteを結合して、Blockformの一覧を作る。
     * 
     */
    @Override
    public List<BlockForm> combine(List<Place> places, List<Route> routes) {
        int ord = 0;
        List<BlockForm> result = new ArrayList<BlockForm>();
        Iterator<Place> placeIte = places.iterator();
        Iterator<Route> routeIte = routes.iterator();
        // routeIteは常にplaceIteより一つ少ないので、routeiteで回す。
        while (routeIte.hasNext()) {
            ord++;
            Place p = placeIte.next();
            Route r = routeIte.next();
            result.add(new BlockForm(Long.valueOf(ord), p.getArticle(), p.getFromHour(), p.getFromMinute(),
                    p.getToHour(), p.getToMinute(), p.getPhoto(), p.getUrl(), r.getRoute(), r.getFromHour(),
                    r.getFromMinute(), r.getToHour(), r.getToHour(), true));
        }
        ord++;
        Place p = placeIte.next();
        result.add(new BlockForm(Long.valueOf(ord), p.getArticle(), p.getFromHour(), p.getFromMinute(), p.getToHour(),
                p.getToMinute(), p.getPhoto(), p.getUrl(), null, null, null, null, null, false));

        return result;
    }

}
