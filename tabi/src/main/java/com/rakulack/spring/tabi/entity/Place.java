package com.rakulack.spring.tabi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "place")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "id" })
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "header_id", nullable = false)
    private Long headerId;
    @Column(name = "dest", length = 2000)
    private String dest;
    @Column(name = "article", length = 2000)
    private String article;
    @Column(name = "from_hour")
    private Integer fromHour;
    @Column(name = "from_minute")
    private Integer fromMinute;
    @Column(name = "to_hour")
    private Integer toHour;
    @Column(name = "to_minute")
    private Integer toMinute;
    @Column(name = "img_url", length = 200)
    private String imgUrl;
    @Column(name = "outer_url", length = 200)
    private String outerUrl;
    @Column(name = "prc_date")
    private Date prcDate;
}