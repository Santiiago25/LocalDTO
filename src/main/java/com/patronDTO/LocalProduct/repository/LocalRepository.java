package com.patronDTO.LocalProduct.repository;

import com.patronDTO.LocalProduct.entity.Local;
import com.patronDTO.LocalProduct.projection.interfacebased.open.LocalOpenView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends CrudRepository<Local, Long> {

    List<LocalOpenView> findBy();
}
