package com.microservicio.jfpl.stockmicroservicio.repository;

import com.microservicio.jfpl.stockmicroservicio.entity.StockEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EntityScan("com.microservicio.jfpl.stockmicroservicio.entity")
public interface StockRepository extends JpaRepository<StockEntity, Long> {

    Optional<StockEntity> findByCode(String code);
}
