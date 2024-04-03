package com.patronDTO.LocalProduct.service;

import com.patronDTO.LocalProduct.entity.Local;
import com.patronDTO.LocalProduct.projection.interfacebased.open.LocalOpenView;

import java.util.List;

public interface LocalService {
    List<Local> findAll();

    List<LocalOpenView> findBy();
}
