package com.andremapa.modulo2.exercicio2;

public class Product {

    private long id;
    private String name;
    private String session;
    private String type;
    private String brand;
    private int quantityInStock;
    private static long cont;

    public Product(String name, String session, String type, String brand, int quantityInStock) {
        generateId();
        this.name = name;
        this.session = session;
        this.type = type;
        this.brand = brand;
        this.quantityInStock = quantityInStock;
    }

    public void updateProductAttributes(String name, String session, String type, String brand, int quantityInStock) {
        this.name = name;
        this.session = session;
        this.type = type;
        this.brand = brand;
        this.quantityInStock = quantityInStock;
    }

    private void generateId(){
        this.id = cont;
        cont++;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void addQuantityInStock(int quantityToAdd){
        this.quantityInStock += quantityToAdd;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + name + ", session: " + session +
                ", type: " + type + ", brand: " + brand + ", quantity in-stock: " + quantityInStock;
    }
}
