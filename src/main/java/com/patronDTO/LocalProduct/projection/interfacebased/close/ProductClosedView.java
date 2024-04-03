package com.patronDTO.LocalProduct.projection.interfacebased.close;

public interface ProductClosedView {
    //hay que tomar en cuenta la nomenclatura
    //se debe de usar exactamente el mismo nombre que esta
    //en la entidad, para que JPA pueda interpretar cuales son
    //los campos que debe de mapear
    String getName();

    String getBrand();

}
