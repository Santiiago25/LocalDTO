package com.patronDTO.LocalProduct.repository;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.projection.classbased.ProductDTO;
import com.patronDTO.LocalProduct.projection.interfacebased.close.ProductClosedView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    //Closed view
    List<ProductClosedView> findBy();

    Optional<ProductClosedView> findProductByIdProduct(Long idProduct);

    // View Class Based DTO
    List<ProductDTO> findProductBy();

}
