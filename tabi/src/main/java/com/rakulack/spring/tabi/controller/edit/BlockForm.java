package com.rakulack.spring.tabi.controller.edit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlockForm {

    private Long ord;
    private String article;
    private Integer placeFromHour;
    private Integer placeFromMinute;
    private Integer placeToHour;
    private Integer placeToMinute;
    private byte[] photo;
    private String url;
    private String route;
    private Integer routeFromHour;
    private Integer routeFromMinute;
    private Integer routeToHour;
    private Integer routeToMinute;
    private boolean hasRoute;
}
