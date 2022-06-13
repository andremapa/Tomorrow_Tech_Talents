package com.andremapa.modulo3_POOII.exercicio3.controller;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;
import com.andremapa.modulo3_POOII.exercicio3.services.CashRegisterAdultService;
import com.andremapa.modulo3_POOII.exercicio3.services.CashRegisterService;
import com.andremapa.modulo3_POOII.exercicio3.services.LibraryService;

import java.util.List;

public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void postProduct(Product product){
        libraryService.postProduct(product);
    }

    public void postProductList(List<Product> products){
        libraryService.postAllProduct(products);
    }

    public List<Product> getAllProducts(){
        return libraryService.getAll();
    }

    public Product getById(int id){
        return libraryService.getById(id);
    }

    public <T extends Product> List<Product> getByCategory(T entity){
        return libraryService.getByCategory(entity);
    }

    public void deleteById(int id){
        libraryService.deleteById(id);
    }

    public void deleteAll(List<Product> products){
        libraryService.deleteAll(products);
    }

    public <T extends Product> Product putById(int id, T entity){
        return libraryService.putById(id, entity);
    }

    public  <T extends Product> long countTheQuantity(T entity){
        return libraryService.countTheQuantity(entity);
    }

}
