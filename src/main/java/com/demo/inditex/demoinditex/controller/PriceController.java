package com.demo.inditex.demoinditex.controller;

import com.demo.inditex.demoinditex.dto.PriceResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class PriceController {

    @GetMapping("/getPrices")
    public ResponseEntity<PriceResponseDTO> getPrices() {
        PriceResponseDTO responseDTO = new PriceResponseDTO();
        responseDTO.setBrandId(1L);
        responseDTO.setEndDate(LocalDate.now());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
