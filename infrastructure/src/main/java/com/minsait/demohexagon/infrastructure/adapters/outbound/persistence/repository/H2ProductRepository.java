package com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.repository;

import com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface H2ProductRepository extends JpaRepository<Long, Product>, JpaSpecificationExecutor<Product> {
}
