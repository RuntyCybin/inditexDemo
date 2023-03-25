package com.demo.inditex.demoinditex.repository;

import com.demo.inditex.demoinditex.dto.PriceRequestDTO;
import com.demo.inditex.demoinditex.entitie.Precios;

import java.util.List;

public interface PrecioCustomRepo {
    public List<Precios> findPreciosPorRequest(PriceRequestDTO priceRequestDTO);
}
