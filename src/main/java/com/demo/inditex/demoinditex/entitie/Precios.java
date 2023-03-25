package com.demo.inditex.demoinditex.entitie;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "precios")
public class Precios {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;

    @Column(name = "brand_id")
    private Integer brand_id;

    @Column(name="start_date")
    private LocalDateTime start_date;

    @Column(name="end_date")
    private LocalDateTime end_date;

    @Column(name="price_list")
    private Long price_list;

    @Column(name="priority")
    private Long priority;

    @Column(name="precio")
    private Double precio;

    @Column(name="curr")
    private String curr;

    @ManyToOne()
    @JoinColumn(name="id_producto", referencedColumnName = "id")
    private Producto producto;

}

