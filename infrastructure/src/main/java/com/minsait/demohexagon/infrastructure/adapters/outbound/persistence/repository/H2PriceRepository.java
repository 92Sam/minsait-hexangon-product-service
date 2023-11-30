package com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.repository;

import com.minsait.demohexagon.infrastructure.adapters.outbound.persistence.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface H2PriceRepository<T extends Price> extends JpaRepository<Price, Long>, JpaSpecificationExecutor<Price> {
}
