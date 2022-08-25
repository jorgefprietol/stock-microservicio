package com.microservicio.jfpl.stockmicroservicio.controller;

import com.microservicio.jfpl.stockmicroservicio.entity.StockEntity;
import com.microservicio.jfpl.stockmicroservicio.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    public boolean stockDisponible(@PathVariable String code) {
        Optional<StockEntity> stock = stockRepository.findByCode(code);
        stock.orElseThrow(() -> new RuntimeException("No se encuentra el producto" + code));

        return stock.get().getQuantity() > 0;

    }
}
