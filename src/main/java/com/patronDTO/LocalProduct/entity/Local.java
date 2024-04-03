package com.patronDTO.LocalProduct.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "local")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_local")
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "piso")
    private String floor;
}
