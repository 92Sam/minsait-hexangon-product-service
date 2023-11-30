package com.minsait.demohexagon.application.services;

import com.minsait.demohexagon.domain.entity.Price;

import java.util.List;

public interface PriceService {
    List<Price> getAllPrices();
    Price getPriceById(Long id) throws Throwable;
    Price savePrice(Price price);
    Price deletePrice(Price price);
}
