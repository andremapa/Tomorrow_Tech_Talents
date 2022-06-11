package com.andremapa.modulo3_POOII.exercicio3.domain.repositories;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;
import com.andremapa.modulo3_POOII.exercicio3.exceptions.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DatabaseRepositoryImpl implements DatabaseRepository{

    private final List<Product> database = new ArrayList<>();

    private static final String DEFAULT_ERROR_MESSAGE = "Product not found by id in the stock";

    @Override
    public void saveProduct(Product entity){
        database.add(entity);
    }

    @Override
    public List<Product> findAll(){
        return database;
    }

    @Override
    public Product findById(int id){
        return database.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException(DEFAULT_ERROR_MESSAGE));
    }

    @Override
    public void deleteById(int id){
        database.remove(database.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException(DEFAULT_ERROR_MESSAGE)));
    }

    @Override
    public void deleteAll(List<Product> products){
        database.removeAll(products);
    }

    @Override
    public <T extends Product> Product updateById(int id, T entity){
        return database.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException(DEFAULT_ERROR_MESSAGE))
                .updateData(entity);
    }

    @Override
    public <T extends Product> List<Product> findByCategory(T entity){
        return database.stream()
                .filter(product -> product.getClass().isInstance(entity))
                .toList();
    }
}
