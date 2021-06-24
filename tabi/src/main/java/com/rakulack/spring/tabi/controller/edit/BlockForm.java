package com.rakulack.spring.tabi.controller.edit;

import java.text.DecimalFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlockForm {

    private Long ord;
    private Long headerId;
    private Long placeId;
    private String dest;
    private String article;
    private Integer placeFromHour;
    private Integer placeFromMinute;
    private Integer placeToHour;
    private Integer placeToMinute;
    private String imgUrl;
    private String outerUrl;
    private Long routeId;
    private String route;
    private Integer routeFromHour;
    private Integer routeFromMinute;
    private Integer routeToHour;
    private Integer routeToMinute;
    private boolean hasRoute;

    public String CombinePlaceFromTime() {
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(placeFromHour) + ":" + formatter.format(placeFromMinute);
    }

    public String CombinePlaceToTime() {
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(placeToHour) + ":" + formatter.format(placeToMinute);
    }

    public String CombineRouteFromTime() {
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(routeFromHour) + ":" + formatter.format(routeFromMinute);
    }

    public String CombineRouteToTime() {
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(routeToHour) + ":" + formatter.format(routeToMinute);
    }

}
