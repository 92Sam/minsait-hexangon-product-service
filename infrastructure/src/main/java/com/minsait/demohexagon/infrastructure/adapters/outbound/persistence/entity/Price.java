package com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.entity;


import com.minsait.demohexagon.domain.enums.Priority;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity(name = "prices")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Brand.class)
    private Brand brand;

    @Column(name = "name")
    private String name;

    @Column(name = "price_list")
    private Integer priceList;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "priority")
    private Priority priority;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

}
