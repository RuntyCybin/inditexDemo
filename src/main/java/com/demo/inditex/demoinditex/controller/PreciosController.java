package com.demo.inditex.demoinditex.controller;

import com.demo.inditex.demoinditex.dto.PriceRequestDTO;
import com.demo.inditex.demoinditex.dto.PriceResponseDTO;
import com.demo.inditex.demoinditex.service.PrecioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PreciosController {

    private PrecioService precioService;

    @Autowired
    public PreciosController(PrecioService service) {
        this.precioService = service;
    }

    @GetMapping("/validatePrices")
    public ResponseEntity<List<PriceResponseDTO>> getPrices(
            @RequestBody @Valid PriceRequestDTO priceRequestDTO) {
        return new ResponseEntity<>(precioService.validate(priceRequestDTO), HttpStatus.OK);
    }
}
