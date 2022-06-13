package com.andremapa.modulo3_POOII.exercicio3.controller;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.*;
import com.andremapa.modulo3_POOII.exercicio3.exceptions.IllegalPurchase;
import com.andremapa.modulo3_POOII.exercicio3.services.CashRegisterAdultService;
import com.andremapa.modulo3_POOII.exercicio3.services.CashRegisterService;

import java.util.List;

public class ClientController {

    private final CashRegisterService cashRegisterService;
    private final CashRegisterAdultService cashRegisterAdultService;

    public ClientController(CashRegisterService cashRegisterService, CashRegisterAdultService cashRegisterAdultService) {
        this.cashRegisterService = cashRegisterService;
        this.cashRegisterAdultService = cashRegisterAdultService;
    }

    public void buyProducts(List<Product> list){
        if (list.stream().anyMatch(AdultProduct.class::isInstance)){
            throw new IllegalPurchase("You can't buy Adult Products without a document!");
        }
        cashRegisterService.buyProducts(list);
    }

    public void buyProducts(List<Product> list, Document document){
        cashRegisterAdultService.buyProducts(list, document);
    }

}
