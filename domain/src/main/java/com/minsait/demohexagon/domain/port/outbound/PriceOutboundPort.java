package com.minsait.demohexagon.domain.port.outbound;

import com.minsait.demohexagon.domain.entity.Price;
import com.minsait.demohexagon.domain.exception.RecordNotFoundException;

import java.util.List;

public interface PriceOutboundPort {

    List<Price> findAll();

    Price findById(Long id) throws Throwable;

    Price save(Price product);

}
