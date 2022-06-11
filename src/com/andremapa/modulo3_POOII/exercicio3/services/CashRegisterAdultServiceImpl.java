package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Book;
import com.andremapa.modulo3_POOII.exercicio3.domain.models.CashRegister;
import com.andremapa.modulo3_POOII.exercicio3.domain.models.Document;
import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;
import com.andremapa.modulo3_POOII.exercicio3.domain.repositories.DatabaseRepository;
import com.andremapa.modulo3_POOII.exercicio3.exceptions.IllegalPurchase;
import com.andremapa.modulo3_POOII.exercicio3.exceptions.ResourceNotFoundException;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

public class CashRegisterAdultServiceImpl implements CashRegisterAdultService{

    private final DatabaseRepository databaseRepository;
    private final CashRegister cashRegister;

    public CashRegisterAdultServiceImpl(DatabaseRepository databaseRepository, CashRegister cashRegister) {
        this.databaseRepository = databaseRepository;
        this.cashRegister = cashRegister;
    }

    @Override
    public void buyProducts(List<Product> productList, Document document) {
        verifyCustomerAge(document);
        verifyIfTheProductExistsOnStock(productList);
        addCashToTheCashRegister(productList);
        databaseRepository.deleteAll(productList);
    }

    private void verifyCustomerAge(Document document){
        if(document.getBirthdate().getYear() - LocalDate.EPOCH.getYear() < 18){
            throw new IllegalPurchase("The customer is not over 18 years of age");
        }
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
        cashRegister.addMoneyToCash(checkTheValueOfBookPurchases(productList, finalPrice));
    }

    private double checkTheValueOfBookPurchases(List<Product> productList, double price){
        Book book = new Book("t", 0, 0);
        if(productList.stream().allMatch(p -> p.getClass().isInstance(book))){
            return price - (price*0.15);
        }
        return price;
    }
}
