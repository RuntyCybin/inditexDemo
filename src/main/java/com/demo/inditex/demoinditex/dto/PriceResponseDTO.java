package com.demo.inditex.demoinditex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceResponseDTO implements Serializable {
    private Long productId;
    private Long brandId;
    private Integer priceList;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double price;
}
