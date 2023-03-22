package com.demo.inditex.demoinditex.repository;

import com.demo.inditex.demoinditex.entitie.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
}
