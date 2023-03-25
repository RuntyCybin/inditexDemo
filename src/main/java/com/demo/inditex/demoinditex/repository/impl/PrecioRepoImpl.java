package com.demo.inditex.demoinditex.repository.impl;

import com.demo.inditex.demoinditex.dto.PriceRequestDTO;
import com.demo.inditex.demoinditex.entitie.Precios;
import com.demo.inditex.demoinditex.repository.PrecioCustomRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class PrecioRepoImpl implements PrecioCustomRepo {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Precios> findPreciosPorRequest(PriceRequestDTO priceRequestDTO) {

        List<Object> responseObj = entityManager.createQuery("FROM Precios pr " +
                        "WHERE (:fechaApp BETWEEN pr.start_date AND pr.end_date) " +
                        "AND pr.brand_id = :idCad " +
                        "AND pr.producto.id = :idProd " +
                        "ORDER BY pr.priority")
                .setParameter("fechaApp", priceRequestDTO.getFechaAplicacion())
                .setParameter("idProd", priceRequestDTO.getProductId())
                .setParameter("idCad", priceRequestDTO.getBrandId())
                .getResultList();

        return responseObj.stream()
                .filter(Precios.class::isInstance)
                .map(Precios.class::cast)
                .toList();
    }
}
