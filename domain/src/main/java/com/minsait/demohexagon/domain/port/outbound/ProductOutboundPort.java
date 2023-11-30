package com.minsait.demohexagon.domain.port.outbound;

import com.minsait.demohexagon.domain.entity.Product;

import java.util.List;

public interface ProductOutboundPort {

    public List<Product> findAll();

    public Product findById(Long id);

    public Product save(Product product);

}
