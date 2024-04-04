package com.patronDTO.LocalProduct.controller;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.projection.classbased.ProductDTO;
import com.patronDTO.LocalProduct.projection.interfacebased.close.ProductClosedView;
import com.patronDTO.LocalProduct.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    //Closed View Interface Based
    @GetMapping("/findAllProductsClosedView")
    public List<ProductClosedView> findAllProductsClosedView(){
        return productService.findBy();
    }

    @GetMapping("/findProductById/{idProduct}")
    public Optional<ProductClosedView> findProductById(@PathVariable Long idProduct){
        return productService.findProductById(idProduct);
    }

    @GetMapping("/findProductClassBased")
    public List<ProductDTO> findProductClassBased(){
        return productService.findProductBy();
    }

}
