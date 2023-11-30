package com.minsait.demohexagon.application.services;

import com.minsait.demohexagon.domain.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void saveProduct(Product product);
}
