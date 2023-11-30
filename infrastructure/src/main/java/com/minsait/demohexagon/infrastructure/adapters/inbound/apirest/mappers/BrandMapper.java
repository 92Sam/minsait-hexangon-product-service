package com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.mappers;

import com.minsait.demohexagon.domain.entity.Brand;
import com.minsait.demohexagon.domain.entity.Price;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto.BrandReqDTO;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto.PriceReqDTO;

public class BrandMapper {

    public static Brand toBrand(BrandReqDTO brandReqDTO) {
        return Brand.builder()
                .id(brandReqDTO.id())
                .name(brandReqDTO.name())
                .build();
    }
}
