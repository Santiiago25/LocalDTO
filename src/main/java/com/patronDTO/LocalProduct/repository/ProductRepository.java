package com.patronDTO.LocalProduct.repository;

import com.patronDTO.LocalProduct.entity.Product;
import com.patronDTO.LocalProduct.projection.interfacebased.close.ProductClosedView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    //Closed view
    List<ProductClosedView> findBy();

}
