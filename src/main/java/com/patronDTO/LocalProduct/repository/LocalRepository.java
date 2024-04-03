package com.patronDTO.LocalProduct.repository;

import com.patronDTO.LocalProduct.entity.Local;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends CrudRepository<Local, Long> {
}
