package com.microservicio.jfpl.stockmicroservicio.repository;

import com.microservicio.jfpl.stockmicroservicio.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository extends JpaRepository<StockRepository, Long> {
    Optional<StockEntity> findByCode(String code);
}
