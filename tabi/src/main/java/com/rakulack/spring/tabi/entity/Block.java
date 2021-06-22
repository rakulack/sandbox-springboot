package com.rakulack.spring.tabi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "ord" })
public class Block {
    private Long id;
    private Long headerId;
    private String article;
    private Integer fromHour;
    private Integer fromMinute;
    private Integer toHour;
    private Integer toMinute;
    private byte[] photo;
    private String url;

}
