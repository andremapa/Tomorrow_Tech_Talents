package com.andremapa.modulo2.aula02;

public class Product {

    private long id;
    private static int cont = 0;
    private String name;
    private String session;
    private String type;
    private String brand;
    private int quantityOnStock;

    public Product(String name, String session, String type, String brand, int quantityOnStock) {
        id = cont;
        cont++;
        this.name = name;
        this.session = session;
        this.type = type;
        this.brand = brand;
        this.quantityOnStock = quantityOnStock;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void addQuantityOnStock(int quantityOnStock) {
        this.quantityOnStock+= quantityOnStock;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setSession(String session) {
        this.session = session;
        return this;
    }

    public Product setType(String type) {
        this.type = type;
        return this;
    }

    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Product setQuantityOnStock(int quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", session='" + session + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", quantityOnStock=" + quantityOnStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
