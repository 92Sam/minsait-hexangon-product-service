package com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.mappers;

import com.minsait.demohexagon.domain.entity.Price;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto.PriceReqDTO;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto.PriceResDTO;

public class PriceMapper {

    public static Price toPrice(PriceReqDTO priceReqDTO) {
        return Price.builder()
                .id(priceReqDTO.id())
                .name(priceReqDTO.name())
                .price(priceReqDTO.price())
                .brand(BrandMapper.toBrand(priceReqDTO.brand()))
                .build();
    }

    public static PriceResDTO toPriceResDTO(Price price) {
        return PriceResDTO.builder()
                .id(price.getId())
                .name(price.getName())
                .price(price.getPrice())
                .build();
    }
}
