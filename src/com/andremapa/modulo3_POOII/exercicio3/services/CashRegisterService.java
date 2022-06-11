package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;

import java.util.List;

public interface CashRegisterService {

    void buyProducts (List<Product> productList);
}
