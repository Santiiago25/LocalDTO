package com.patronDTO.LocalProduct.projection.classbased;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class ProductDTO {
    //Definir que informacion se desea exponer
    private String name;
    private String brand;
    private float price;
}
