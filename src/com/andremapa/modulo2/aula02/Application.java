package com.andremapa.modulo2.aula02;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Stock stock = new Stock();
        stock.createProduct("Book 1", "Library", "TI", "World", 50);
        stock.createProduct("Book 1", "Library", "TI", "World", 50);
        stock.createProduct("Book 2", "Library", "TI", "World", 143);
        stock.createProduct("Book 3 ", "Library", "TI", "World", 98);
        System.out.println("\nTest readAll():");
        stock.readAllProducts();
        System.out.println("\nTest readProduct(id):");
        stock.readProduct(1);
        System.out.println("\nTest updateProduct(id, name, session, type, brand, quantity):");
        stock.updateProduct(1, "Phone", "TI", "Smartphone", "Nokia", 50);
        System.out.println("\nTest deleteProduct(id):");
        stock.deleteProduct(1);
    }
}
