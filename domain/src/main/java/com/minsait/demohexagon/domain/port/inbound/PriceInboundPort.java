package com.minsait.demohexagon.domain.port.inbound;

import com.minsait.demohexagon.domain.entity.Price;

import java.util.List;

public interface PriceInboundPort {

    List<Price> findAll();

    Price findById(Long id);

    Price save(Price product);

    Price update(Price product);
    
    void delete(Price product);
}
