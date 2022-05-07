package com.andremapa.modulo2.aula02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stock {

    private long id;
    public String name;
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void createProduct (String name, String  session, String  type, String  brand, int quantityOnStock){
        if (verifyIfTheProductExistsByTheName(name)){
            findProduct(name).addQuantityOnStock(quantityOnStock);
        } else {
            var product = new Product(name, session, type, brand, quantityOnStock);
            products.add(product);
        }
    }

    public void readAllProducts(){
        products.forEach(System.out::println);
    }

    public void readProduct(long id){
        products.stream().filter(x -> x.getId() == id).forEach(System.out::println);
    }

    public void updateProduct(long id, String name, String session, String type, String brand, int quantityOnStock){
        products.stream()
                .filter(x -> x.getId() == id)
                .map(x -> x.setName(name).setSession(session).setType(type).setBrand(brand).setQuantityOnStock(quantityOnStock))
                .forEach(System.out::println);
    }

    public void deleteProduct(long id){
       products.removeIf(x -> x.getId() == id);
       products.forEach(System.out::println);
    }

    private Product findProduct(String name){
        return products.stream().filter(product -> product.getName().equals(name)).toList().get(0);
    }

    private boolean verifyIfTheProductExistsByTheName(String name){
        return products.stream().anyMatch(product -> name.equals(product.getName()));
    }

    private void clearScannerBuffer(Scanner sc){
        if (sc.hasNextLine()){
            sc.nextLine();
        }
    }
}
