package com.patronDTO.LocalProduct.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProduct;

    @Column(name = "nombre")
    private String name;

    @Column(name = "marca")
    private String brand;

    @Column(name = "caducado")
    private boolean expired;

    @Column(name = "precio")
    private float price;

    //Inyectar la clase para la relacion muchos a uno
    @ManyToOne
    @JoinColumn(
            name = "id",
            referencedColumnName = "id_local"
    )
    private Local local;
}
