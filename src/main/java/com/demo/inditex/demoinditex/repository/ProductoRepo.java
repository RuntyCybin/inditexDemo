package com.demo.inditex.demoinditex.repository;

import com.demo.inditex.demoinditex.entitie.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Long>, ProductoCustomRepo {
}
