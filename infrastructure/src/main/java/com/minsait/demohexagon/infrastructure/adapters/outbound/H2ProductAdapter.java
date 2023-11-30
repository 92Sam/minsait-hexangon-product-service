package com.minsait.demohexagon.infrastructure.adapters.outbound;

import com.minsait.demohexagon.domain.entity.Product;
import com.minsait.demohexagon.domain.port.outbound.ProductOutboundPort;
import com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.repository.H2ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class H2ProductAdapter implements ProductOutboundPort {

    H2ProductRepository h2ProductRepository;

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return Product.builder().price(100).name("TEST").id(100L).build();
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
