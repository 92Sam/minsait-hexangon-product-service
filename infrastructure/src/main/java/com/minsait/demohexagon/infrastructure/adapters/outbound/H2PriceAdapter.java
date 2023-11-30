package com.minsait.demohexagon.infrastructure.adapters.outbound;

import com.minsait.demohexagon.domain.entity.Price;
import com.minsait.demohexagon.domain.exception.PriceNotFoundException;
import com.minsait.demohexagon.domain.port.outbound.PriceOutboundPort;
import com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.repository.H2PriceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class H2PriceAdapter implements PriceOutboundPort {

    @Autowired
    private H2PriceRepository h2PriceRepository;

    @Override
    public List<Price> findAll() {
        return h2PriceRepository.findAll();
    }

    @Override
    public Price findById(Long id) throws Throwable {
        return (Price) h2PriceRepository.findById(id).orElseThrow(() -> new PriceNotFoundException(id));
    }

    @Override
    public Price save(Price price) {
        return (Price) h2PriceRepository.save(price);
    }
}
