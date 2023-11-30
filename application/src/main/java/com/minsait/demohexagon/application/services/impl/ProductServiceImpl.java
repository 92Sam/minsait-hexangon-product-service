package com.minsait.demohexagon.application.services.impl;

import com.minsait.demohexagon.application.services.ProductService;
import com.minsait.demohexagon.domain.entity.Product;
import com.minsait.demohexagon.domain.port.outbound.ProductOutboundPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductOutboundPort productOutboundPort;

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productOutboundPort.findById(id);
    }

    @Override
    public void saveProduct(Product product) {

    }
}
