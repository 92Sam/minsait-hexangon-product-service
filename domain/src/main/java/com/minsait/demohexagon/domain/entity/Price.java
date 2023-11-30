package com.minsait.demohexagon.domain.entity;

import com.minsait.demohexagon.domain.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private Long id;
    private String name;
    private Integer priceList;
    private Long productId;
    private Priority priority;
    private BigDecimal price;
    private Brand brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}