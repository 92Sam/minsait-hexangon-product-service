package com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto;

import com.minsait.demohexagon.domain.enums.Priority;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class PriceResDTO {
    Long id;
    String name;
    Integer priceList;
    Long productId;
    Priority priority;
    BigDecimal price;
    BrandResDTO brand;
    LocalDateTime startDate;
    LocalDateTime endDate;
}
