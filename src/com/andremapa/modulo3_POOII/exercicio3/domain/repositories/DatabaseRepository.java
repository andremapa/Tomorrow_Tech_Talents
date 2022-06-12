package com.andremapa.modulo3_POOII.exercicio3.domain.repositories;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;

import java.util.List;

public interface DatabaseRepository {

    void saveProduct(Product entity);
    void saveProductList(List<Product> entities);
    List<Product> findAll();
    Product findById(int id);
    void deleteById(int id);
    void deleteAll(List<Product> products);
    <T extends Product> Product updateById(int id, T entity);
    <T extends Product> List<Product> findByCategory(T entity);
}
