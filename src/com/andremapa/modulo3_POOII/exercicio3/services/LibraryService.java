package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;

public interface LibraryService {

    <T extends Product> long countTheQuantity(T entity);
}
