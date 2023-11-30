package com.minsait.demohexagon.infrastructure.config;

import com.minsait.demohexagon.application.services.ProductService;
import com.minsait.demohexagon.application.services.impl.ProductServiceImpl;
import com.minsait.demohexagon.domain.port.outbound.ProductOutboundPort;
import com.minsait.demohexagon.infrastructure.adapters.outbound.H2ProductAdapter;
import com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.repository.H2ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfrastructureConfig {

    @Bean
    ProductService ProductService(ProductOutboundPort productOutboundPort){
        return new ProductServiceImpl(productOutboundPort);
    }

}
