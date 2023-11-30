package com.minsait.demohexagon.domain.port.inbound;

import com.minsait.demohexagon.domain.entity.Product;

import java.util.List;

public interface ProductInboundPort {

    public List<Product> findAll();

    public Product findById(Long id);

    public Product save(Product product);
}
