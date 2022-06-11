package com.andremapa.modulo3_POOII.exercicio3.domain.models;

public abstract class Product {

    protected String name;
    protected int id;
    protected double price;

    protected Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public abstract <T extends Product> Product updateData(T product);

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
