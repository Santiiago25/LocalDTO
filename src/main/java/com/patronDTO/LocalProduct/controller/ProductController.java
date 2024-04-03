package com.patronDTO.LocalProduct.controller;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

}
