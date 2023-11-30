package com.minsait.demohexagon.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.minsait.demohexagon"})
@EnableJpaRepositories(
        basePackages = {"com.minsait.demohexagon.infrastructure.adapters.outbound.*"}
)
@EntityScan(basePackages = "com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.entity")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
