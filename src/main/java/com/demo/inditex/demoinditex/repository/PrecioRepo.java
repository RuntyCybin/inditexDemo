package com.demo.inditex.demoinditex.repository;

import com.demo.inditex.demoinditex.entitie.Precios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioRepo extends JpaRepository<Precios, Long>, PrecioCustomRepo {
}
