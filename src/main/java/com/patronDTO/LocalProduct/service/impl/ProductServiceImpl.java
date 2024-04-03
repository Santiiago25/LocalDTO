package com.patronDTO.LocalProduct.service.impl;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.repository.ProductRepository;
import com.patronDTO.LocalProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }
}
