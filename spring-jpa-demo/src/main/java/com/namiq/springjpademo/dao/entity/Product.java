package com.namiq.springjpademo.dao.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private Integer stock;
}
