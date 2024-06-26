package com.patronDTO.LocalProduct.service;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.projection.classbased.ProductDTO;
import com.patronDTO.LocalProduct.projection.interfacebased.close.ProductClosedView;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    List<ProductClosedView> findBy();

    Optional<ProductClosedView> findProductById(Long id);

    List<ProductDTO> findProductBy();

    ProductClosedView findByBrandDynamicClosedView(String brand);

    ProductDTO findByBrandDynamicClassBased(String brand);
}
