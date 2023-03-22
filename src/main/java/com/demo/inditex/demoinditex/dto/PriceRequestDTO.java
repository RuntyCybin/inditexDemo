package com.demo.inditex.demoinditex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRequestDTO implements Serializable {
    private LocalDate fechaAplicacion;
    private Long productId;
    private Integer brandId;
}
