package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.CashRegister;
import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;
import com.andremapa.modulo3_POOII.exercicio3.domain.repositories.DatabaseRepository;
import com.andremapa.modulo3_POOII.exercicio3.exceptions.ResourceNotFoundException;

import java.util.HashSet;
import java.util.List;

public class CashRegisterServiceImpl implements CashRegisterService{

    private final DatabaseRepository databaseRepository;
    private final CashRegister cashRegister;

    public CashRegisterServiceImpl(DatabaseRepository databaseRepository, CashRegister cashRegister) {
        this.databaseRepository = databaseRepository;
        this.cashRegister = cashRegister;
    }

    @Override
    public void buyProducts (List<Product> productList){
        verifyIfTheProductExistsOnStock(productList);
        addCashToTheCashRegister(productList);
        databaseRepository.deleteAll(productList);
    }

    private void verifyIfTheProductExistsOnStock(List<Product> entities){
        List<Product> productsOnStock = databaseRepository.findAll();
        if(!new HashSet<>(productsOnStock).containsAll(entities)){
            throw new ResourceNotFoundException("The product that you want to buy didn't exists!");
        }
    }

    private void addCashToTheCashRegister(List<Product> productList){
        double finalPrice = 0;
        for (Double price: productList.stream().map(Product::getPrice).toList()) {
           finalPrice += price;
        }
        cashRegister.addMoneyToCash(finalPrice);
    }
}
