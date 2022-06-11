package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;
import com.andremapa.modulo3_POOII.exercicio3.domain.repositories.DatabaseRepository;

public class LibraryServiceImpl implements LibraryService{

    private final DatabaseRepository databaseRepository;

    public LibraryServiceImpl(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    @Override
    public <T extends Product> long countTheQuantity( T entity){
        return databaseRepository.findAll().stream()
                .filter(product -> product.getClass().isInstance(entity))
                .count();
    }

}
