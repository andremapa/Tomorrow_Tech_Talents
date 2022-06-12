package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;
import com.andremapa.modulo3_POOII.exercicio3.domain.repositories.DatabaseRepository;

import java.util.List;

public class LibraryServiceImpl implements LibraryService{

    private final DatabaseRepository databaseRepository;

    public LibraryServiceImpl(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    @Override
    public void postProduct(Product entity){
        databaseRepository.saveProduct(entity);
    }

    @Override
    public void postAllProduct(List<Product> entities){
        databaseRepository.saveProductList(entities);
    }

    @Override
    public List<Product> getAll(){
        return databaseRepository.findAll();
    }

    @Override
    public Product getById(int id){
        return databaseRepository.findById(id);
    }

    @Override
    public <T extends Product> List<Product> getByCategory(T entity){
        return databaseRepository.findByCategory(entity);
    }

    @Override
    public void deleteById(int id){
        databaseRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Product> products){
        databaseRepository.deleteAll(products);
    }

    @Override
    public <T extends Product> Product putById(int id, T entity){
        return databaseRepository.updateById(id,entity);
    }

    @Override
    public <T extends Product> long countTheQuantity( T entity){
        return databaseRepository.findAll().stream()
                .filter(product -> product.getClass().isInstance(entity))
                .count();
    }

}
