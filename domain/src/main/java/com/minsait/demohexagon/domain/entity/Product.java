package com.minsait.demohexagon.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
public class Product {
    private Long id;
    private String name;
    private double price;
    private LocalDateTime createdAt;
}