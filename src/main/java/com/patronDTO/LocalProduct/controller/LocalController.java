package com.patronDTO.LocalProduct.controller;

import com.patronDTO.LocalProduct.entity.Local;
import com.patronDTO.LocalProduct.projection.interfacebased.open.LocalOpenView;
import com.patronDTO.LocalProduct.service.impl.LocalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/local")
public class LocalController {

    @Autowired
    private LocalServiceImpl localService;

    @GetMapping("/findAll")
    public List<Local> findAll(){
        return localService.findAll();
    }

    @GetMapping("/findAllOpenView")
    public List<LocalOpenView> findAllOpenView(){
        return localService.findBy();
    }

}
