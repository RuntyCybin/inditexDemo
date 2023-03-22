package com.demo.inditex.demoinditex.entitie;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "precios")
public class Precios {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;

    @Column(name="start_date")
    private String start_date;

    @Column(name="end_date")
    private String end_date;

    @Column(name="price_list")
    private Long price_list;

    @Column(name="priority")
    private Long priority;

    @Column(name="precio")
    private Long precio;

    @Column(name="curr")
    private String curr;

    @ManyToOne()
    @JoinColumn(name="id_producto", referencedColumnName = "id")
    private Producto producto;

}

