package com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "product")
public class Product {

    @Column(name = "id")
    private Long id;

    @Column(name = "id")
    private String name;


    @Column(name = "id")
    private double price;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
