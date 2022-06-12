package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;

import java.util.List;

public interface LibraryService {

    void postProduct(Product entity);
    void postAllProduct(List<Product> entities);
    List<Product> getAll();
    Product getById(int id);
    <T extends Product> List<Product> getByCategory(T entity);
    void deleteById(int id);
    void deleteAll(List<Product> products);
    <T extends Product> Product putById(int id, T entity);
    <T extends Product> long countTheQuantity(T entity);
}
