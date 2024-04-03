package com.patronDTO.LocalProduct.projection.interfacebased.open;

import org.springframework.beans.factory.annotation.Value;

public interface LocalOpenView {
    //trae el name y el floor
    @Value("#{target.name + ' ' + target.floor}")
    String getNameAndFloor();
}
