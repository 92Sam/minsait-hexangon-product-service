package com.minsait.demohexagon.infrastructure.config;

import com.minsait.demohexagon.application.services.PriceService;
import com.minsait.demohexagon.application.services.impl.PriceServiceImpl;
import com.minsait.demohexagon.domain.port.outbound.PriceOutboundPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfrastructureConfig {
    @Bean
    PriceService productService(PriceOutboundPort priceOutboundPort){
        return new PriceServiceImpl(priceOutboundPort);
    }

//    @Bean
//    PriceOutboundPort h2PriceAdapter()

}
