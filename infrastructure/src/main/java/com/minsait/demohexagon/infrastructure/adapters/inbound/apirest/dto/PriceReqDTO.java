package com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto;

import com.minsait.demohexagon.domain.entity.Brand;
import com.minsait.demohexagon.domain.enums.Priority;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceReqDTO(
        Long id,
        String name,
        Integer priceList,
        Long productId,
        Priority priority,
        BigDecimal price,
        BrandReqDTO brand,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
