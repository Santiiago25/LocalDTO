package com.patronDTO.LocalProduct.service.impl;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.projection.classbased.ProductDTO;
import com.patronDTO.LocalProduct.projection.interfacebased.close.ProductClosedView;
import com.patronDTO.LocalProduct.repository.ProductRepository;
import com.patronDTO.LocalProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public List<ProductClosedView> findBy() {
        return productRepository.findBy();
    }

    @Override
    public Optional<ProductClosedView> findProductById(Long id) {
        return productRepository.findProductByIdProduct(id);
    }

    @Override
    public List<ProductDTO> findProductBy() {
        return productRepository.findProductBy();
    }

    @Override
    public ProductClosedView findByBrandDynamicClosedView(String brand) {
        ProductClosedView productClosedView = productRepository.findProductByBrand(brand, ProductClosedView.class);
        return productClosedView;
    }

    @Override
    public ProductDTO findByBrandDynamicClassBased(String brand) {
        ProductDTO productDTO = productRepository.findProductByBrand(brand, ProductDTO.class);
        return productDTO;
    }
}
