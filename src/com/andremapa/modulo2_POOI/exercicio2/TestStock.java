package com.andremapa.modulo2_POOI.exercicio2;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("Stock One");

        System.out.println("===============TEST CREATE METHOD===============");
        stock.createProduct("S-10", "Technology", "Smartphone", "Samsung", 130);
        stock.createProduct("S-20", "Technology", "Smartphone", "Samsung", 180);
        stock.createProduct("S-2A", "Technologi", "Smartthone", "Samsing", 100);
        stock.listAllProduct();

        System.out.println("\n===============TEST CREATE METHOD WITH A PRODUCT ALREADY CREATED===============");
        stock.createProduct("S-10", "test", "test", "Samsung", 150);
        stock.listOneProductByName("S-10");

        System.out.println("\n===============TEST UPDATE METHOD===============");
        stock.updateProduct("S-2A", "S-22", "Technology", "Smartphone", "Samsung", 140);
        stock.listOneProductByName("S-22");

        System.out.println("\n===============TEST DELETE METHOD===============");
        stock.deleteProductByName("S-22");
        stock.listAllProduct();
    }
}
