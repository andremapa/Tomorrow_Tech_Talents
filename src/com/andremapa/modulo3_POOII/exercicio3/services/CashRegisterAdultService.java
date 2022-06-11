package com.andremapa.modulo3_POOII.exercicio3.services;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Document;
import com.andremapa.modulo3_POOII.exercicio3.domain.models.Product;

import java.util.List;

public interface CashRegisterAdultService {

    void buyProducts (List<Product> productList, Document document);
}
