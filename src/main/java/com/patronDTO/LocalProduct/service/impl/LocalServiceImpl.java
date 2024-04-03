package com.patronDTO.LocalProduct.service.impl;

import com.patronDTO.LocalProduct.entity.Local;
import com.patronDTO.LocalProduct.projection.interfacebased.open.LocalOpenView;
import com.patronDTO.LocalProduct.repository.LocalRepository;
import com.patronDTO.LocalProduct.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    private LocalRepository localRepository;

    @Override
    public List<Local> findAll() {
        return (List<Local>) localRepository.findAll();
    }

    @Override
    public List<LocalOpenView> findBy() {
        return localRepository.findBy();
    }
}
