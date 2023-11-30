package com.minsait.demohexagon.infrastructure.adapters.inbound.apirest;

import com.minsait.demohexagon.application.services.ProductService;
import com.minsait.demohexagon.domain.entity.Product;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    @GetMapping
    public Product getProduct() {
        return productService.getProductById(12L);
    }
}
