package com.andremapa.modulo2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private long id;
    public String name;
    private List<Product> productList;
    private static long cont;

    public Stock(String name){
        generateId();
        this.name = name;
        productList = new ArrayList<>();
    }

    public Stock(String name, List<Product> productList){
        generateId();
        this.name = name;
        this.productList = productList;
    }

    public void createProduct(String name, String session, String type, String brand, int quantityInStock){
        Product product;
        if (verifyTheProductInStock(name, brand)){
            product = findProductByNameAndBrand(name, brand);
            if (product != null) { product.addQuantityInStock(quantityInStock);}
        } else{
            product = new Product(name, session, type, brand, quantityInStock);
            productList.add(product);
        }
    }

    public void updateProduct(String oldName, String newName, String newSession, String newType, String newBrand, int newQuantityInStock){
        for (Product product : productList) {
            if (product.getName().equals(oldName)){
                product.updateProductAttributes(newName, newSession, newType, newBrand, newQuantityInStock);
            }
        }
    }

    public void deleteProductByName(String name){
        Product aux = null;
        for (Product product: productList) {
            if (product.getName().equals(name)){ aux = product;}
        }
        if (aux != null){ productList.remove(aux);}
    }

    public void listAllProduct(){
        System.out.println("Products in-Stock -> ");
        for (Product product: productList) {
            System.out.println(product);
        }
    }

    public void listOneProductByName(String name){
        System.out.println("Product in-Stock -> ");
        for (Product product: productList) {
            if (product.getName().equals(name)){
                System.out.println(product);
            }
        }
    }

    private boolean verifyTheProductInStock(String name, String brand){
        for (Product product: productList) {
            if (product.getName().equals(name) && product.getBrand().equals(brand)){
                return true;
            }
        }
        return false;
    }

    private Product findProductByNameAndBrand(String name, String brand){
        for (Product product: productList) {
            if (product.getName().equals(name) && product.getBrand().equals(brand)){
                return product;
            }
        }
        return null;
    }

    private void generateId(){
        this.id = cont;
        cont++;
    }

}
