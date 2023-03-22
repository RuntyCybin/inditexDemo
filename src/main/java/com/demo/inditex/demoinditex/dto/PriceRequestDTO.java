package com.demo.inditex.demoinditex.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class PriceRequestDTO implements Serializable {
    private LocalDate fechaAplicacion;
    private Long productId;
    private Integer brandId;
}
