package com.demo.inditex.demoinditex.service;

import com.demo.inditex.demoinditex.dto.PriceRequestDTO;
import com.demo.inditex.demoinditex.dto.PriceResponseDTO;
import com.demo.inditex.demoinditex.entitie.Precios;
import com.demo.inditex.demoinditex.repository.PrecioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioService {

    private PrecioRepo precioRepo;

    @Autowired
    public PrecioService(PrecioRepo precioRepository) {
        this.precioRepo = precioRepository;
    }

    public List<PriceResponseDTO> validate(PriceRequestDTO requestDTO) {

        List<Precios> respuesta = precioRepo.findPreciosPorRequest(requestDTO);

        List<PriceResponseDTO> resp = respuesta.stream()
                .map(r ->
                        new PriceResponseDTO(
                                r.getProducto().getId(),
                                r.getBrand_id(),
                                r.getPrice_list(),
                                r.getStart_date(),
                                r.getEnd_date(),
                                r.getPrecio()))
                .toList();

        return resp;
    }
}
