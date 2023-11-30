package com.minsait.demohexagon.application.services.impl;

import com.minsait.demohexagon.application.services.PriceService;
import com.minsait.demohexagon.domain.entity.Price;
import com.minsait.demohexagon.domain.exception.RecordNotFoundException;
import com.minsait.demohexagon.domain.port.outbound.PriceOutboundPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceOutboundPort priceOutboundPort;

    @Override
    public List<Price> getAllPrices() {
        return priceOutboundPort.findAll();
    }

    @Override
    public Price getPriceById(Long id) throws Throwable {
        return priceOutboundPort.findById(id);
    }

    @Override
    public Price savePrice(Price price) {
        return priceOutboundPort.save(price);
    }

    @Override
    public Price deletePrice(Price price) {
        return null;
    }
}
