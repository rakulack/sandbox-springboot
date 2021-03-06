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

@Table(name = "header")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "id", "hash" })
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "hash", length = 120, nullable = false, unique = true)
    private String hash;
    @Column(name = "title", length = 200, nullable = false)
    private String title;
    @Column(name = "prc_date")
    private Date prcDate;
}