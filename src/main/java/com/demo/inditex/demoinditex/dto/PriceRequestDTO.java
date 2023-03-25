package com.demo.inditex.demoinditex.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

import static com.demo.inditex.demoinditex.util.Constants.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRequestDTO implements Serializable {

    @NotNull(message = FECHA_APLICACION_ERROR)
    private LocalDateTime fechaAplicacion;

    @NotNull(message = PRODUCT_ID_ERROR)
    @Positive
    private Long productId;

    @NotNull(message = BRAND_ID_ERROR)
    @Min(1)
    private Integer brandId;
}
