package com.demo.inditex.demoinditex.service;

import com.demo.inditex.demoinditex.dto.PriceRequestDTO;
import com.demo.inditex.demoinditex.dto.PriceResponseDTO;
import com.demo.inditex.demoinditex.entitie.Precios;
import com.demo.inditex.demoinditex.exception.PrecioNotFoundException;
import com.demo.inditex.demoinditex.repository.PrecioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.demo.inditex.demoinditex.util.Constants.PRECIO_NOT_FOUND_ERROR;

@Service
public class PrecioService {

    private PrecioRepo precioRepo;

    @Autowired
    public PrecioService(PrecioRepo precioRepository) {
        this.precioRepo = precioRepository;
    }

    public List<PriceResponseDTO> validate(PriceRequestDTO requestDTO) throws PrecioNotFoundException {

        List<Precios> respuesta = precioRepo.findPreciosPorRequest(requestDTO);

        if (respuesta.size() == 0) {
            throw new PrecioNotFoundException(PRECIO_NOT_FOUND_ERROR);
        } else {

            return respuesta.stream()
                    .map(r ->
                            new PriceResponseDTO(
                                    r.getProducto().getId(),
                                    r.getBrand_id(),
                                    r.getPrice_list(),
                                    r.getStart_date(),
                                    r.getEnd_date(),
                                    r.getPrecio()))
                    .toList();
        }

    }
}
